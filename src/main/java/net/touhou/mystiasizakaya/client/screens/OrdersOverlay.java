
package net.touhou.mystiasizakaya.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.touhou.mystiasizakaya.procedures.GetCuisinesTextureProcedure;
import net.touhou.mystiasizakaya.procedures.GetBeveragesTextureProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({ Dist.CLIENT })
public class OrdersOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.getLevel();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA,
				GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE,
				GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		String fm = "";
		String fmb = "";
		int reali = 0;
		for (int i = 0; i < 7; i++) {
			fm = GetCuisinesTextureProcedure.execute(i);
			fmb = GetBeveragesTextureProcedure.execute(i);
			if (fm != "" || fmb != "") {
				RenderSystem.setShaderTexture(0, new ResourceLocation("mystias_izakaya:textures/screens/page.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), 0 + reali * 34, h - 32, 0, 0, 36, 32, 36, 32);

				if (fm != "") {

					RenderSystem.setShaderTexture(0,
							new ResourceLocation("mystias_izakaya:textures/item/" + fm + ".png"));
					Minecraft.getInstance().gui.blit(event.getPoseStack(), 2 + reali * 34, h - 30, 0, 0, 16, 16, 16,
							16);
				}
				if (fmb != "") {
					RenderSystem.setShaderTexture(0,
							new ResourceLocation("mystias_izakaya:textures/item/" + fmb + ".png"));
					Minecraft.getInstance().gui.blit(event.getPoseStack(), 18 + reali * 34, h - 30, 0, 0, 16, 16, 16,
							16);
				}
				Minecraft.getInstance().font.draw(event.getPoseStack(), new java.text.DecimalFormat("#######").format(i) + "\u53f7\u684c", 8 + reali * 34, h - 10,
				-16777216);
				reali++;
			}
			fm = "";

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
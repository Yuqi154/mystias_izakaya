package net.touhou.mystiasizakaya.client.gui;

import net.touhou.mystiasizakaya.world.inventory.CookingRangeUiMenu;
import net.touhou.mystiasizakaya.procedures.Text5Procedure;
import net.touhou.mystiasizakaya.procedures.Text4Procedure;
import net.touhou.mystiasizakaya.procedures.Text3Procedure;
import net.touhou.mystiasizakaya.procedures.Text2Procedure;
import net.touhou.mystiasizakaya.procedures.Text1Procedure;
import net.touhou.mystiasizakaya.procedures.StatusProcedure;
import net.touhou.mystiasizakaya.procedures.Show5Procedure;
import net.touhou.mystiasizakaya.procedures.Show4Procedure;
import net.touhou.mystiasizakaya.procedures.Show3Procedure;
import net.touhou.mystiasizakaya.procedures.Show2Procedure;
import net.touhou.mystiasizakaya.procedures.Show1Procedure;
import net.touhou.mystiasizakaya.procedures.LefttimeProcedure;
import net.touhou.mystiasizakaya.network.CookingRangeUiButtonMessage;
import net.touhou.mystiasizakaya.MystiasIzakayaMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CookingRangeUiScreen extends AbstractContainerScreen<CookingRangeUiMenu> {
	private final static HashMap<String, Object> guistate = CookingRangeUiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_confirm;
	Button button_select;
	Button button_select1;
	Button button_select2;
	Button button_select3;
	Button button_select4;

	public CookingRangeUiScreen(CookingRangeUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 280;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mystias_izakaya:textures/screens/cooking_range_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				Text1Procedure.execute(world, x, y, z), 44, 29, -1, false);
		guiGraphics.drawString(this.font,

				Text2Procedure.execute(world, x, y, z), 44, 56, -1, false);
		guiGraphics.drawString(this.font,

				Text3Procedure.execute(world, x, y, z), 44, 83, -1, false);
		guiGraphics.drawString(this.font,

				Text4Procedure.execute(world, x, y, z), 44, 110, -1, false);
		guiGraphics.drawString(this.font,

				Text5Procedure.execute(world, x, y, z), 44, 137, -1, false);
		guiGraphics.drawString(this.font,

				StatusProcedure.execute(world, x, y, z), 233, 26, -1, false);
		guiGraphics.drawString(this.font,

				LefttimeProcedure.execute(world, x, y, z), 238, 65, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_confirm = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_confirm"), e -> {
			if (true) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(0, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 94, this.topPos + 60, 90, 20).build();
		guistate.put("button:button_confirm", button_confirm);
		this.addRenderableWidget(button_confirm);
		button_select = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_select"), e -> {
			if (Show1Procedure.execute(entity)) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(1, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 24, 45, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Show1Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select", button_select);
		this.addRenderableWidget(button_select);
		button_select1 = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_select1"), e -> {
			if (Show2Procedure.execute(entity)) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(2, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 51, 45, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Show2Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select1", button_select1);
		this.addRenderableWidget(button_select1);
		button_select2 = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_select2"), e -> {
			if (Show3Procedure.execute(entity)) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(3, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 78, 45, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Show3Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select2", button_select2);
		this.addRenderableWidget(button_select2);
		button_select3 = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_select3"), e -> {
			if (Show4Procedure.execute(entity)) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(4, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 105, 45, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Show4Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select3", button_select3);
		this.addRenderableWidget(button_select3);
		button_select4 = Button.builder(Component.translatable("gui.mystias_izakaya.cooking_range_ui.button_select4"), e -> {
			if (Show5Procedure.execute(entity)) {
				MystiasIzakayaMod.PACKET_HANDLER.sendToServer(new CookingRangeUiButtonMessage(5, x, y, z));
				CookingRangeUiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 40, this.topPos + 132, 45, 20).build(builder -> new Button(builder) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (Show5Procedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_select4", button_select4);
		this.addRenderableWidget(button_select4);
	}
}

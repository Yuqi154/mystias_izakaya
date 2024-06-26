package org.hiedacamellia.mystiasizakaya.content.orders;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;
import org.hiedacamellia.mystiasizakaya.functionals.network.Variables;

import java.util.List;

public class GetBeveragesTexture {
	public static String execute(double id, Player player) {
		Initorders.init(player);
		List<String> orders_list = player.getCapability(Variables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Variables.PlayerVariables()).ordersbeverages;
		if(orders_list.size()<=id) return "";
		String order = orders_list.get((int) id);
		TagKey<Item> tag = ItemTags.create(new ResourceLocation("mystiasizakaya:beverages"));
		if (!new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(order))).is(tag)) {
			return "";
		}
		return order.split(":")[1]+ "_";
	}
}

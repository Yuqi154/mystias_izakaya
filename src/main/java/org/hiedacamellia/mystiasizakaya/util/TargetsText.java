package org.hiedacamellia.mystiasizakaya.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

public class TargetsText {
	public static String get(LevelAccessor world, double x, double y, double z, double i) {
		String str = "";
		if (ItemStack.EMPTY.getItem() == GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) (7 + i)).getItem()) {
			return "";
		}
		str = (GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) (7 + i))).getDisplayName().getString();
		str = str.replace("[", "").replace("]", "");
		return str;
	}
}

package org.hiedacamellia.mystiasizakaya.util;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.Map;
import java.util.function.Supplier;

public class ButtunShow {
	public static boolean get(Entity entity,int _slotID) {
		if (entity == null)
			return false;
		if (ItemStack.EMPTY.getItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(_slotID)).getItem() : ItemStack.EMPTY).getItem()) {
			return false;
		}
		return true;
	}
}

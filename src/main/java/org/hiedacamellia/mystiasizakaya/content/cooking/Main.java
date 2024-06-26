package org.hiedacamellia.mystiasizakaya.content.cooking;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;
import org.hiedacamellia.mystiasizakaya.content.cooking.kitchenwares.*;
import org.hiedacamellia.mystiasizakaya.content.item.ItemRegistery;
import org.hiedacamellia.mystiasizakaya.integration.youkaihomecoming.IngredientsCompact;
import org.hiedacamellia.mystiasizakaya.util.GetItemStack;
import org.hiedacamellia.mystiasizakaya.util.GetValue;
import org.hiedacamellia.mystiasizakaya.util.SetSlotItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Main {
	public static void execute(LevelAccessor world, double x, double y, double z) {
        double i;
		double time;
		ItemStack util;
		ItemStack target;
		List<String> targets = new ArrayList<>();
		time = GetValue.getDouble(world, BlockPos.containing(x, y, z), "timeleft");
		if (time > 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("timeleft", (time - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (time == 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("timeleft", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			target = GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 12);
			SetSlotItem.setSlotItem(world, x, y, z, target, 6, 1);
			GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 6).getOrCreateTag().putString("tags",
					(GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 12).getOrCreateTag()
							.getString("tags")));
			SetSlotItem.setEmptySlot(world, x, y, z, 12);
		} else {
			if (!(GetValue.getBoolean(world, BlockPos.containing(x, y, z), "breaking"))) {
				if (ItemStack.EMPTY.getItem() == GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 4)
						.getItem()
						&& !(ItemStack.EMPTY.getItem() == GetItemStack
								.getItemStack(world, BlockPos.containing(x, y, z), 5).getItem())) {
					SetSlotItem.setSlotItem(world, x, y, z,
							GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 5), 4, 1);
					SetSlotItem.setEmptySlot(world, x, y, z, 5);
				}
				if (ItemStack.EMPTY.getItem() == GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 3)
						.getItem()
						&& !(ItemStack.EMPTY.getItem() == GetItemStack
								.getItemStack(world, BlockPos.containing(x, y, z), 4).getItem())) {
					SetSlotItem.setSlotItem(world, x, y, z,
							GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 4), 3, 1);
					SetSlotItem.setEmptySlot(world, x, y, z, 4);
				}
				if (ItemStack.EMPTY.getItem() == GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 2)
						.getItem()
						&& !(ItemStack.EMPTY.getItem() == GetItemStack
								.getItemStack(world, BlockPos.containing(x, y, z), 3).getItem())) {
					SetSlotItem.setSlotItem(world, x, y, z,
							GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 3), 2, 1);
					SetSlotItem.setEmptySlot(world, x, y, z, 3);
				}
				if (ItemStack.EMPTY.getItem() == GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 1)
						.getItem()
						&& !(ItemStack.EMPTY.getItem() == GetItemStack
								.getItemStack(world, BlockPos.containing(x, y, z), 2).getItem())) {
					SetSlotItem.setSlotItem(world, x, y, z,
							GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 2), 1, 1);
					SetSlotItem.setEmptySlot(world, x, y, z, 2);
				}

				util = GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), 0);
				if (util.getItem() == ItemStack.EMPTY.getItem()) {
					SetSlotItem.setEmptySlot(world, x, y, z, 12);
				}

				List<String> raws = new ArrayList<>();
				i = 1;
				while (i <= 5) {
					if (!(GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) i).getItem() == ItemStack.EMPTY.getItem())) {
						ItemStack raw = GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) i);
						raw = IngredientsCompact.execute(raw);
						raws.add((Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(raw.getItem())).toString()));
					}
					i = i + 1;
				}
				if (util.getItem() == ItemRegistery.LIAO_LI_TAI.get()) {
					targets = CuttingBoard.get(raws);
				}
				if (util.getItem() == ItemRegistery.SHAO_KAO_JIA.get()) {
					targets = Grill.get(raws);
				}
				if (util.getItem() == ItemRegistery.YOU_GUO.get()) {
					targets = FryingPan.get(raws);
				}
				if (util.getItem() == ItemRegistery.ZHENG_GUO.get()) {
					targets = Steamer.get(raws);
				}
				if (util.getItem() == ItemRegistery.ZHU_GUO.get()) {
					targets = BoilingPot.get(raws);
				}

                i = 0;
				while (i < 5) {
					if (i < targets.size()) {
						SetSlotItem.setSlotItem(world, x, y, z, new ItemStack(Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((targets.get((int) i))).toLowerCase(Locale.ENGLISH))))), (int) (7 + i), 1);
					} else {
						SetSlotItem.setEmptySlot(world, x, y, z, (int) (7 + i));
					}
					i = i + 1;
				}
			} else {
				SetSlotItem.setEmptySlot(world, x, y, z, 7);
				SetSlotItem.setEmptySlot(world, x, y, z, 8);
				SetSlotItem.setEmptySlot(world, x, y, z, 9);
				SetSlotItem.setEmptySlot(world, x, y, z, 10);
				SetSlotItem.setEmptySlot(world, x, y, z, 11);
				SetSlotItem.setEmptySlot(world, x, y, z, 12);
			}
		}
	}
}

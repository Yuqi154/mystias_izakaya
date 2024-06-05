package net.touhou.mystiasizakaya.cooking.kitchenwares;

import net.touhou.mystiasizakaya.init.MystiasIzakayaModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.touhou.mystiasizakaya.procedures.YHCProcedure;
import net.touhou.mystiasizakaya.util.GetItemStack;

import java.util.List;
import java.util.ArrayList;

public class Grill {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		String str = "";
		ItemStack raw = ItemStack.EMPTY;
		double i = 0;
		List<Object> raws = new ArrayList<>();
		List<String> tags = new ArrayList<>();
		List<String> negativetags = new ArrayList<>();
		i = 1;
		while (i <= 5) {
			if (!(GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) i).getItem() == ItemStack.EMPTY.getItem())) {
				raw = GetItemStack.getItemStack(world, BlockPos.containing(x, y, z), (int) i);
				raw = YHCProcedure.execute(raw);
				raws.add((ForgeRegistries.ITEMS.getKey(raw.getItem()).toString()));
			}
			i = i + 1;
		}
		str = "";
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.MIAN_FEN.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.YANG_CONG.get()).toString()))
				&& raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.FENG_MI.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.TU_DOU.get()).toString()))
				&& raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.LUO_BU.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.BU_SI_NIAO.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.HE_NIU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.SAN_WEN_YU.get()).toString()))
				&& raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZHU_ROU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.LU_ROU.get()).toString()))
				&& raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZHU_ZI.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.PENG_LAI_YU_ZHI.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.NIU_ROU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.YANG_CONG.get()).toString()))
				&& raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.NAN_GUA.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.NENG_LIANG_CHUAN.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.HEI_MAO_ZHU_ROU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.YE_ZHU_ROU.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ER_TIAN_LIU.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZHU_ROU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.FENG_MI.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.MI_ZHI_CHA_SHAO.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZHU_ROU.get()).toString())) && raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZUN_YU.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.ZHU_ROU_ZUN_YU_XUN.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.MO_GU.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.KAO_MO_GU.get()).toString() + "$end%";
		}
		if (raws.contains((ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.BA_MU_MAN.get()).toString()))) {
			str = str + "$start%" + ForgeRegistries.ITEMS.getKey(MystiasIzakayaModItems.KAO_BA_MU_MAN.get()).toString() + "$end%";
		}
		return str;
	}
}
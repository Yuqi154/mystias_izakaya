package org.hiedacamellia.mystiasizakaya.content.cooking.ui;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import org.hiedacamellia.mystiasizakaya.util.GetValue;

public class Lefttime {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		if (GetValue.getDouble(world, BlockPos.containing(x, y, z), "timeleft") != 0) {
			return new java.text.DecimalFormat("#.#")
					.format((GetValue.getDouble(world, BlockPos.containing(x, y, z), "timeleft")) / 20) + "s";
		}
		return "";
	}
}


package org.hiedacamellia.mystiasizakaya.content.item.ingredients;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import org.hiedacamellia.mystiasizakaya.content.item.items.Ingredients;

public class ChanShuiItem extends Ingredients {
	public ChanShuiItem() {
		super(1, 0.8f, Rarity.COMMON, "chan_shui", new String[]{"Peculiar"});
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}

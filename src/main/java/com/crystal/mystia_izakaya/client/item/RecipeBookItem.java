package com.crystal.mystia_izakaya.client.item;

import com.crystal.mystia_izakaya.MystiaIzakaya;
import com.crystal.mystia_izakaya.client.item.tooltip.RecordMealTooltip;
import com.crystal.mystia_izakaya.registry.ComponentRegistry;
import com.crystal.mystia_izakaya.utils.FoodTagEnum;
import com.crystal.mystia_izakaya.utils.MealList;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class RecipeBookItem extends Item {
    public RecipeBookItem() {
        super(new Item.Properties().rarity(Rarity.COMMON).stacksTo(1));
    }

    @Override
    public @NotNull Optional<TooltipComponent> getTooltipImage(@NotNull ItemStack itemstack) {
        var component = itemstack.get(ComponentRegistry.TARGET_ITEM);
        if (component != null) {
            ItemStack itemStack = MealList.getInstance().getCookedMeals().get(component.target()).getDefaultInstance();
            return Optional.of(new RecordMealTooltip(itemStack));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        var foodTagComponent = pStack.get(ComponentRegistry.FOOD_TAG);
        FoodTagEnum[] foodTagEnums = MealList.getInstance().getFood();
        var targetComponent = pStack.get(ComponentRegistry.TARGET_ITEM);
        if (targetComponent != null) {
            CookedMealItem cookedMealItem = MealList.getInstance().getCookedMeals().get(targetComponent.target());
            pTooltipComponents.add(Component.translatable("component.mystia_izakaya.required_cooker")
                    .append(" : ")
                    .append(Component.translatable("block.mystia_izakaya." + cookedMealItem.cookerTypeEnum.getName())));
            pTooltipComponents.add(Component.translatable("component.mystia_izakaya.required_ingredients"));
            for (int i = 0; i < cookedMealItem.ingredients.length; i++) {
                Item item = cookedMealItem.ingredients[i];
                Player player = Minecraft.getInstance().player;
                int color = Color.WHITE.getRGB();
                if (player != null) {
                    color = (player.getInventory().contains(item.getDefaultInstance())) ? Color.GREEN.getRGB() : Color.RED.getRGB();
                }
                pTooltipComponents.add(Component.translatable(item.getDescriptionId()).withColor(color));
            }
        } else if (foodTagComponent != null) {
            IntList intList = foodTagComponent.intList();
            intList.intStream().mapToObj(integer -> foodTagEnums[integer])
                    .filter(Objects::nonNull)
                    .forEach(foodTagEnum -> pTooltipComponents.add(Component.translatable(MystiaIzakaya.MODID + "." + foodTagEnum.name()).withColor(Color.GREEN.getRGB())));
        }
    }
}

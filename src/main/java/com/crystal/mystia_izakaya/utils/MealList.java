package com.crystal.mystia_izakaya.utils;

import com.crystal.mystia_izakaya.registry.ItemRegistry;
import net.minecraft.world.item.Item;

import java.util.List;

public class MealList {
    private static MealList instance;
    private final List<Item> meals;
    private final FoodTagEnum[] food = FoodTagEnum.values();

    private MealList() {
        meals = List.of(ItemRegistry.Oedo_Boat_Feast.get(),
                ItemRegistry.Dragonsong_Peach.get(),
                ItemRegistry.Planet_Mars.get(),
                ItemRegistry.Two_Flavor_Beef_Hotpot.get(),
                ItemRegistry.Mad_Hatters_Tea_Party.get(),
                ItemRegistry.Scrumptious_Storm.get(),
                ItemRegistry.Buddha_Jump_Over_The_Wall.get(),
                ItemRegistry.Beef_Wellington.get(),
                ItemRegistry.Dragon_Carp.get(),
                ItemRegistry.Eight_Trigram_Fish_Maws.get(),
                ItemRegistry.Supreme_Seafood_Noodles.get(),
                ItemRegistry.Faint_Dream.get(),
                ItemRegistry.Star_Lotus_Ship.get(),
                ItemRegistry.Rainbow_Pan_Fride_Pork_Buns.get(),
                ItemRegistry.Moonlight_over_the_Lotus_Pond.get(),
                ItemRegistry.Urchin_Raindrop_Cake.get(),
                ItemRegistry.Fujis_Lava.get(),
                ItemRegistry.Hourai_Branch.get(),
                ItemRegistry.Against_the_World.get(),
                ItemRegistry.Origin_of_Life.get(),
                ItemRegistry.Imitation_Shirikodama.get(),
                ItemRegistry.Kittens_Water_Play.get(),
                ItemRegistry.Palace_of_the_Han.get(),
                ItemRegistry.All_Meat_Feast.get(),
                ItemRegistry.Urchin_Steamed_Egg.get(),
                ItemRegistry.Mushroom_Maidens_Tip_Tap_Pot.get(),
                ItemRegistry.Caution_Hellish_Spice.get(),
                ItemRegistry.Sea_Urchin_Sashimi.get(),
                ItemRegistry.Daimyos_Feast.get(),
                ItemRegistry.Kabuto_Steamed_Cake.get(),
                ItemRegistry.Bamboo_Spring.get(),
                ItemRegistry.Shirayuki.get(),
                ItemRegistry.Buddhas_Delight.get(),
                ItemRegistry.Lotus_Fish_Lamps.get(),
                ItemRegistry.Agony_Oden.get(),
                ItemRegistry.Seven_Colored_Yokan.get(),
                ItemRegistry.Niten_Ichiryu.get(),
                ItemRegistry.Heart_Trobbing_Surprise.get(),
                ItemRegistry.Sashimi_Platter.get(),
                ItemRegistry.Creamy_Crab.get(),
                ItemRegistry.Little_Sweet_Poision.get(),
                ItemRegistry.Cubic_Kedama_Volcanic_Tofu.get(),
                ItemRegistry.Lunar_Dango.get(),
                ItemRegistry.Molecular_Egg.get(),
                ItemRegistry.Ino_Shika_Chou.get(),
                ItemRegistry.Udumbara_Cake.get(),
                ItemRegistry.Natures_Beauty.get(),
                ItemRegistry.Cubic_Kedama_Ice_Cream.get(),
                ItemRegistry.Kitten_Pizza.get(),
                ItemRegistry.Burn_out_Pudding.get(),
                ItemRegistry.Rice_Powder_Meat.get(),
                ItemRegistry.Tempura_Platter.get(),
                ItemRegistry.White_Deer_Unyielding_Pine.get(),
                ItemRegistry.Italian_Risotto.get(),
                ItemRegistry.Imitation_Bear_Paw.get(),
                ItemRegistry.Cantonese_Char_Siu.get(),
                ItemRegistry.Sichuan_Boiled_Fish.get(),
                ItemRegistry.Lunar_Lover_Biscuit.get(),
                ItemRegistry.Hunters_Casserole.get(),
                ItemRegistry.Ceiling_Longing_Pie.get(),
                ItemRegistry.Kaguya_Hime.get(),
                ItemRegistry.Immortal_Turkey.get(),
                ItemRegistry.Golden_Ribs_Soup.get(),
                ItemRegistry.Golden_Two_Shroom_Wrap.get(),
                ItemRegistry.Instant_Death.get(),
                ItemRegistry.Secret_Savory_Mushroom_Hotpot.get(),
                ItemRegistry.Tonkotsu_Ramen.get(),
                ItemRegistry.Scholars_Ginkyo.get(),
                ItemRegistry.Classic_Steak.get(),
                ItemRegistry.Scarlet_Devil_Cake.get(),
                ItemRegistry.Unconscious_Youkai_Mousse.get(),
                ItemRegistry.Giant_Tamagoyaki.get(),
                ItemRegistry.Peach_Flower_Crystal_Ball.get(),
                ItemRegistry.Hot_Pepper_Soup.get(),
                ItemRegistry.Drunk_Shrimp_in_Bamboo.get(),
                ItemRegistry.Salmon_Steak.get(),
                ItemRegistry.Miasma_Garden.get(),
                ItemRegistry.Smoked_Buccaneer.get(),
                ItemRegistry.Vegetable_Salad.get(),
                ItemRegistry.Pure_White_Lotus.get(),
                ItemRegistry.Ordinary_Eat_Me_Cupcake.get(),
                ItemRegistry.Peach_Yatsuhashi.get(),
                ItemRegistry.Peach_Tapioca.get(),
                ItemRegistry.Real_Seafood_Miso_Soup.get(),
                ItemRegistry.Tianshis_Stewed_Mushrooms.get(),
                ItemRegistry.Shrimp_Stuffed_Pumpkin.get(),
                ItemRegistry.Energy_Skewer.get(),
                ItemRegistry.Falling_Blossoms.get(),
                ItemRegistry.Pine_Nut_Cake.get(),
                ItemRegistry.Yashouma_Dango.get(),
                ItemRegistry.Eel_Bowl_with_Egg.get(),
                ItemRegistry.Kitten_Canele.get(),
                ItemRegistry.Salmon_Tempura.get(),
                ItemRegistry.Kabayaki_Lampreys.get(),
                ItemRegistry.Peach_Braised_Pork.get(),
                ItemRegistry.Bamboo_Meat_Pot.get(),
                ItemRegistry.Crispy_Spirals.get(),
                ItemRegistry.Energy_Pudding.get(),
                ItemRegistry.Flowing_Somen.get(),
                ItemRegistry.Hodgepodge.get(),
                ItemRegistry.Steamed_Egg_Bamboo_Shoots.get(),
                ItemRegistry.Dorayaki.get(),
                ItemRegistry.Golden_Crispy_Fish_Cake.get(),
                ItemRegistry.Gloomy_Fruit_Pie.get(),
                ItemRegistry.Takoyaki.get(),
                ItemRegistry.Long_Hair_Princess.get(),
                ItemRegistry.Tangyuan.get(),
                ItemRegistry.Dumplings.get(),
                ItemRegistry.Eggs_Benedict.get(),
                ItemRegistry.Heart_Warming_Congee.get(),
                ItemRegistry.Power_Soup.get(),
                ItemRegistry.Mapo_Tofu.get(),
                ItemRegistry.Plum_Tea_Rice.get(),
                ItemRegistry.Sakura_Pudding.get(),
                ItemRegistry.Mochi.get(),
                ItemRegistry.Pink_Rice_Ball.get(),
                ItemRegistry.Secret_Dried_Fish_Crisps.get(),
                ItemRegistry.Toon_Pancake.get(),
                ItemRegistry.Candied_Sweet_Potato.get(),
                ItemRegistry.Honeyed_Chestnut.get(),
                ItemRegistry.Red_Bean_Daifuku.get(),
                ItemRegistry.Lions_Head.get(),
                ItemRegistry.Nigiri_Sushi.get(),
                ItemRegistry.Cream_of_Mushroom_Hotpot.get(),
                ItemRegistry.Fried_Lamprey.get(),
                ItemRegistry.Pork_Trout_Kebab.get(),
                ItemRegistry.Tomato_Fries.get(),
                ItemRegistry.Biscay_Biscuits.get(),
                ItemRegistry.Neko_Manma.get(),
                ItemRegistry.Cheese_Omelette.get(),
                ItemRegistry.Peach_Shrimp_Salad.get(),
                ItemRegistry.Pork_Bamboo_Shoots_Stir_Fry.get(),
                ItemRegistry.Fried_Pork_Cutlet.get(),
                ItemRegistry.Baked_Sweet_Potato.get(),
                ItemRegistry.Misery_Cheese_Sticks.get(),
                ItemRegistry.Stinky_Tofu.get(),
                ItemRegistry.Mushroom_Herb_Road.get(),
                ItemRegistry.Okonomiyaki.get(),
                ItemRegistry.Pancakes_With_Syrup.get(),
                ItemRegistry.Potato_Croquettes.get(),
                ItemRegistry.Boiled_Tofu.get(),
                ItemRegistry.Grilled_Lamprey.get(),
                ItemRegistry.Deep_Fried_Shrimp_Tempura.get(),
                ItemRegistry.Fresh_Tofu.get(),
                ItemRegistry.Miso_Tofu.get(),
                ItemRegistry.Carved_Rose_Salad.get(),
                ItemRegistry.Creamy_Vegetable_Chowder.get(),
                ItemRegistry.Pork_Bowl.get(),
                ItemRegistry.Beef_Bawl.get(),
                ItemRegistry.Unzan_Cotton_Candy.get(),
                ItemRegistry.Pork_Mushroom_Stir_Fry.get(),
                ItemRegistry.Fried_Cicada_Sloughs.get(),
                ItemRegistry.Tofu_Stew.get(),
                ItemRegistry.Roasted_Mushroom.get(),
                ItemRegistry.Dew_Runny_Eggs.get(),
                ItemRegistry.Deep_Fried_Tofu.get(),
                ItemRegistry.Pickles.get(),
                ItemRegistry.Pork_Stir_Fry.get(),
                ItemRegistry.Pork_Rice_Ball.get(),
                ItemRegistry.Scones.get(),
                ItemRegistry.Sea_Miso_soup.get(),
                ItemRegistry.Rice_Ball.get());
    }

    // 提供公共的访问方法
    public static synchronized MealList getInstance() {
        if (instance == null) {
            instance = new MealList();
        }
        return instance;
    }

    public List<Item> getMeals() {
        return meals;
    }

    public FoodTagEnum[] getFood() {
        return food;
    }
}

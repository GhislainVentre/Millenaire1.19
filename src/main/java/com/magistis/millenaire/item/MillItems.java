/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.item;

import com.magistis.millenaire.entity.MillEntityTypes;
import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.block.MillBlocks;
import com.magistis.millenaire.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class MillItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Millenaire.MOD_ID);

    public static final RegistryObject<Item> DENIER = ITEMS.register("denier", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> DENIER_OR = ITEMS.register("denier_or", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> DENIER_ARGENT = ITEMS.register("denier_argent", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> TUTORIAL_BOOK = ITEMS.register("tutorial_book", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> VILLAGER_EGG = ITEMS.register("villager_egg", () -> new ForgeSpawnEggItem(MillEntityTypes.BYZANTINE_ARTISAN0, 0x000000, 0x000000, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> SILK = ITEMS.register("silk", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_FLAKE = ITEMS.register("obsidian_flake", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> UNKNOWN_POWDER = ITEMS.register("unknown_powder", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> WOOL_CLOTH = ITEMS.register("wool_cloth", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> SILK_CLOTH = ITEMS.register("silk_cloth", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> HIDE = ITEMS.register("hide", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BRICK_MOULD = ITEMS.register("brick_mould", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_TAPESTRY = ITEMS.register("norman_tapestry", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> INDIAN_STATUE = ITEMS.register("indian_statue", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> SODDING_SPADE = ITEMS.register("sodding_spade", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> GALIANITE_DUST = ITEMS.register("galianite_dust", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    // Crops
    public static final RegistryObject<Item> TURMERIC = ITEMS.register("turmeric", () -> new ItemNameBlockItem(MillBlocks.TURMERIC_CROP.get(), new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(MillBlocks.RICE_CROP.get(), new Item.Properties().tab(MillCreativeModeTab.MILL_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.05f).build())));
    public static final RegistryObject<Item> MAIZE = ITEMS.register("maize", () -> new ItemNameBlockItem(MillBlocks.MAIZE_CROP.get(), new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes", () -> new ItemNameBlockItem(MillBlocks.VINE_CROP.get(), new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    // Food
    public static final RegistryObject<Item> CIDER_APPLE = ITEMS.register("cider_apple", () -> new Item(new Item.Properties().food(MillFoods.CIDER_APPLE).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> CIDER = ITEMS.register("cider", () -> new Item(new Item.Properties().food(MillFoods.CIDER).stacksTo(1).durability(10).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> CALVA = ITEMS.register("calva", () -> new Item(new Item.Properties().food(MillFoods.CALVA).stacksTo(1).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> TRIPES = ITEMS.register("tripes", () -> new Item(new Item.Properties().food(MillFoods.TRIPES).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BOUDIN_NOIR = ITEMS.register("boudin_noir", () -> new Item(new Item.Properties().food(MillFoods.BOUDIN_NOIR).tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> VEG_CURRY = ITEMS.register("veg_curry", () -> new Item(new Item.Properties().food(MillFoods.VEG_CURRY).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MURGH_CURRY = ITEMS.register("murgh_curry", () -> new Item(new Item.Properties().food(MillFoods.MURGH_CURRY).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> RASGULLA = ITEMS.register("rasgulla", () -> new Item(new Item.Properties().food(MillFoods.RASGULLA).tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> CACAUHAA = ITEMS.register("cacauhaa", () -> new Item(new Item.Properties().food(MillFoods.CACAUHAA).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MASA = ITEMS.register("masa", () -> new Item(new Item.Properties().food(MillFoods.MASA).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAH = ITEMS.register("wah", () -> new Item(new Item.Properties().food(MillFoods.WAH).tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> WINE = ITEMS.register("wine", () -> new Item(new Item.Properties().food(MillFoods.WINE).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MALSAVIA_WINE = ITEMS.register("malvasia_wine", () -> new Item(new Item.Properties().food(MillFoods.MALSAVIA_WINE).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> FETA = ITEMS.register("feta", () -> new Item(new Item.Properties().food(MillFoods.FETA).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> SOUVLAKI = ITEMS.register("souvlaki", () -> new Item(new Item.Properties().food(MillFoods.SOUVLAKI).tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> SAKE = ITEMS.register("sake", () -> new Item(new Item.Properties().food(MillFoods.SAKE).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> UDON = ITEMS.register("udon", () -> new Item(new Item.Properties().food(MillFoods.UDON).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> IKAYAKI = ITEMS.register("ikayaki", () -> new Item(new Item.Properties().food(MillFoods.IKAYAKI).tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> LAMB_COOKED = ITEMS.register("lamb_cooked", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> LAMB_RAW = ITEMS.register("lamb_raw", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    // Armor
    public static final RegistryObject<Item> NORMAN_HELMET = ITEMS.register("norman_helmet", () -> new ArmorItem(MillArmorMaterials.NORMAN, EquipmentSlot.HEAD, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_CHESTPLATE = ITEMS.register("norman_chestplate", () -> new ArmorItem(MillArmorMaterials.NORMAN, EquipmentSlot.CHEST, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_LEGGINGS = ITEMS.register("norman_leggings", () -> new ArmorItem(MillArmorMaterials.NORMAN, EquipmentSlot.LEGS, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_BOOTS = ITEMS.register("norman_boots", () -> new ArmorItem(MillArmorMaterials.NORMAN, EquipmentSlot.FEET, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> BYZANTINE_HELMET = ITEMS.register("byzantine_helmet", () -> new ArmorItem(MillArmorMaterials.BYZANTINE, EquipmentSlot.HEAD, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_CHESTPLATE = ITEMS.register("byzantine_chestplate", () -> new ArmorItem(MillArmorMaterials.BYZANTINE, EquipmentSlot.CHEST, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_LEGGINGS = ITEMS.register("byzantine_leggings", () -> new ArmorItem(MillArmorMaterials.BYZANTINE, EquipmentSlot.LEGS, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_BOOTS = ITEMS.register("byzantine_boots", () -> new ArmorItem(MillArmorMaterials.BYZANTINE, EquipmentSlot.FEET, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_GUARD_HELMET = ITEMS.register("japanese_guard_helmet", () -> new ArmorItem(MillArmorMaterials.JAPANESE_GUARD, EquipmentSlot.HEAD, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_CHESTPLATE = ITEMS.register("japanese_guard_chestplate", () -> new ArmorItem(MillArmorMaterials.JAPANESE_GUARD, EquipmentSlot.CHEST, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_LEGGINGS = ITEMS.register("japanese_guard_leggings", () -> new ArmorItem(MillArmorMaterials.JAPANESE_GUARD, EquipmentSlot.LEGS, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_BOOTS = ITEMS.register("japanese_guard_boots", () -> new ArmorItem(MillArmorMaterials.JAPANESE_GUARD, EquipmentSlot.FEET, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_BLUE_HELMET = ITEMS.register("japanese_blue_helmet", () -> new ArmorItem(MillArmorMaterials.JAPANESE_BLUE, EquipmentSlot.HEAD, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_CHESTPLATE = ITEMS.register("japanese_blue_chestplate", () -> new ArmorItem(MillArmorMaterials.JAPANESE_BLUE, EquipmentSlot.CHEST, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_LEGGINGS = ITEMS.register("japanese_blue_leggings", () -> new ArmorItem(MillArmorMaterials.JAPANESE_BLUE, EquipmentSlot.LEGS, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_BOOTS = ITEMS.register("japanese_blue_boots", () -> new ArmorItem(MillArmorMaterials.JAPANESE_BLUE, EquipmentSlot.FEET, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_RED_HELMET = ITEMS.register("japanese_red_helmet", () -> new ArmorItem(MillArmorMaterials.JAPANESE_RED, EquipmentSlot.HEAD, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_CHESTPLATE = ITEMS.register("japanese_red_chestplate", () -> new ArmorItem(MillArmorMaterials.JAPANESE_RED, EquipmentSlot.CHEST, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_LEGGINGS = ITEMS.register("japanese_red_leggings", () -> new ArmorItem(MillArmorMaterials.JAPANESE_RED, EquipmentSlot.LEGS, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_BOOTS = ITEMS.register("japanese_red_boots", () -> new ArmorItem(MillArmorMaterials.JAPANESE_RED, EquipmentSlot.FEET, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> MAYAN_QUEST_CROWN = ITEMS.register("mayan_quest_crown", () -> new MillMayanQuestCrownItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Wands
    public static final RegistryObject<Item> WAND_SUMMONING = ITEMS.register("wand_summoning", () -> new MillWandItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAND_NEGATION = ITEMS.register("wand_negation", () -> new MillWandItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAND_CREATIVE = ITEMS.register("wand_creative", () -> new MillWandItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> TUNING_FORK = ITEMS.register("tuning_fork", () -> new MillWandItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Tools & Weapons
    public static final RegistryObject<Item> NORMAN_AXE = ITEMS.register("norman_axe", () -> new AxeItem(MillTiers.NORMAN, 1f, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_SHOVEL = ITEMS.register("norman_shovel", () -> new ShovelItem(MillTiers.NORMAN, 1f, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_PICKAXE = ITEMS.register("norman_pickaxe", () -> new PickaxeItem(MillTiers.NORMAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_HOE = ITEMS.register("norman_hoe", () -> new HoeItem(MillTiers.NORMAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_SWORD = ITEMS.register("norman_sword", () -> new SwordItem(MillTiers.NORMAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> MAYAN_AXE = ITEMS.register("mayan_axe", () -> new AxeItem(MillTiers.OBSIDIAN, 1f, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_SHOVEL = ITEMS.register("mayan_shovel", () -> new ShovelItem(MillTiers.OBSIDIAN, 1f, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_PICKAXE = ITEMS.register("mayan_pickaxe", () -> new PickaxeItem(MillTiers.OBSIDIAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_HOE = ITEMS.register("mayan_hoe", () -> new HoeItem(MillTiers.OBSIDIAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_MACE = ITEMS.register("mayan_mace", () -> new SwordItem(MillTiers.OBSIDIAN, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> BYZANTINE_MACE = ITEMS.register("byzantine_mace", () -> new SwordItem(Tiers.IRON, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_SWORD = ITEMS.register("japanese_sword", () -> new SwordItem(Tiers.IRON, 1, 1f, new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BOW = ITEMS.register("japanese_bow", () -> new BowItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> UKKUNGAWOK = ITEMS.register("ukkungawok", () -> new BowItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> ICE_ARROW = ITEMS.register("ice_arrow", () -> new ArrowItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Amulets
    public static final RegistryObject<Item> AMULET_SKOLLHATI = ITEMS.register("amulet_skoll_hati", () -> new MillAmuletItem(new Item.Properties().durability(100).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_YGGDRASIL = ITEMS.register("amulet_yggdrasil", () -> new MillAmuletItem(new Item.Properties().durability(100).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_ALCHEMIST = ITEMS.register("amulet_alchemist", () -> new MillAmuletItem(new Item.Properties().durability(100).tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_VISHNU = ITEMS.register("amulet_vishnu", () -> new MillAmuletItem(new Item.Properties().durability(100).tab(MillCreativeModeTab.MILL_TAB)));

    //Wallet
    public static final RegistryObject<Item> ITEM_MILL_PURSE = ITEMS.register("mill_purse", () -> new MillWalletItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB).stacksTo(1)));

    //Sign
    public static final RegistryObject<Item> ITEM_MILL_SIGN = ITEMS.register("mill_sign", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Parchments
    public static final RegistryObject<Item> NORMAN_VILLAGER_PARCHMENT = ITEMS.register("norman_villager_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> NORMAN_BUILDING_PARCHMENT = ITEMS.register("norman_building_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> NORMAN_ITEM_PARCHMENT = ITEMS.register("norman_item_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> NORMAN_ALL_PARCHMENT = ITEMS.register("norman_all_parchment", () -> new MillParchmentItem(new Item.Properties()));

    public static final RegistryObject<Item> BYZANTINE_VILLAGER_PARCHMENT = ITEMS.register("byzantine_villager_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> BYZANTINE_BUILDING_PARCHMENT = ITEMS.register("byzantine_building_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> BYZANTINE_ITEM_PARCHMENT = ITEMS.register("byzantine_item_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> BYZANTINE_ALL_PARCHMENT = ITEMS.register("byzantine_all_parchment", () -> new MillParchmentItem(new Item.Properties()));

    public static final RegistryObject<Item> HINDI_VILLAGER_PARCHMENT = ITEMS.register("hindi_villager_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> HINDI_BUILDING_PARCHMENT = ITEMS.register("hindi_building_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> HINDI_ITEM_PARCHMENT = ITEMS.register("hindi_item_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> HINDI_ALL_PARCHMENT = ITEMS.register("hindi_all_parchment", () -> new MillParchmentItem(new Item.Properties()));

    public static final RegistryObject<Item> MAYAN_VILLAGER_PARCHMENT = ITEMS.register("mayan_villager_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> MAYAN_BUILDING_PARCHMENT = ITEMS.register("mayan_building_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> MAYAN_ITEM_PARCHMENT = ITEMS.register("mayan_item_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> MAYAN_ALL_PARCHMENT = ITEMS.register("mayan_all_parchment", () -> new MillParchmentItem(new Item.Properties()));

    public static final RegistryObject<Item> JAPANESE_VILLAGER_PARCHMENT = ITEMS.register("japanese_villager_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> JAPANESE_BUILDING_PARCHMENT = ITEMS.register("japanese_building_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> JAPANESE_ITEM_PARCHMENT = ITEMS.register("japanese_item_parchment", () -> new MillParchmentItem(new Item.Properties()));
    public static final RegistryObject<Item> JAPANESE_ALL_PARCHMENT = ITEMS.register("japanese_all_parchment", () -> new MillParchmentItem(new Item.Properties()));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

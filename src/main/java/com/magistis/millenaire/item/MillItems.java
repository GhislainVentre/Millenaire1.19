package com.magistis.millenaire.item;

import com.magistis.millenaire.Millenaire;
import net.minecraft.world.item.Item;
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

    public static final RegistryObject<Item> SILK = ITEMS.register("silk", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_FLAKE = ITEMS.register("obsidian_flake", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> UNKNOWN_POWDER = ITEMS.register("unknown_powder", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> WOOL_CLOTHES = ITEMS.register("wool_clothes", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> SILK_CLOTHES = ITEMS.register("silk_clothes", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> GALIANITE_DUST = ITEMS.register("galianite_dust", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Crops
    public static final RegistryObject<Item> TURMERIC = ITEMS.register("turmeric", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAIZE = ITEMS.register("maize", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> CIDER_APPLE = ITEMS.register("cider_apple", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> CIDER = ITEMS.register("cider", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> CALVA = ITEMS.register("calva", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> TRIPES = ITEMS.register("tripes", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BOUDIN_NOIR = ITEMS.register("boudin_noir", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> VEG_CURRY = ITEMS.register("veg_curry", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MURGH_CURRY = ITEMS.register("murgh_curry", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> RASGULLA = ITEMS.register("rasgulla", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> CACAUHAA = ITEMS.register("cacauhaa", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MASA = ITEMS.register("masa", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAH = ITEMS.register("wah", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> WINE = ITEMS.register("wine", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MALSAVIA_WINE = ITEMS.register("malvasia_wine", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> FETA = ITEMS.register("feta", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> SOUVLAKI = ITEMS.register("souvlaki", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> SAKE = ITEMS.register("sake", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> UDON = ITEMS.register("udon", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> IKAYAKI = ITEMS.register("ikayaki", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> NORMAN_HELMET = ITEMS.register("norman_helmet", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_CHESTPLATE = ITEMS.register("norman_chestplate", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_LEGGINGS = ITEMS.register("norman_leggings", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_BOOTS = ITEMS.register("norman_boots", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> BYZANTINE_HELMET = ITEMS.register("byzantine_helmet", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_CHESTPLATE = ITEMS.register("byzantine_chestplate", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_LEGGINGS = ITEMS.register("byzantine_leggings", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_BOOTS = ITEMS.register("byzantine_boots", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_GUARD_HELMET = ITEMS.register("japanese_guard_helmet", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_CHESTPLATE = ITEMS.register("japanese_guard_chestplate", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_LEGGINGS = ITEMS.register("japanese_guard_leggings", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_GUARD_BOOTS = ITEMS.register("japanese_guard_boots", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_BLUE_HELMET = ITEMS.register("japanese_blue_helmet", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_CHESTPLATE = ITEMS.register("japanese_blue_chestplate", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_LEGGINGS = ITEMS.register("japanese_blue_leggings", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BLUE_BOOTS = ITEMS.register("japanese_blue_boots", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_RED_HELMET = ITEMS.register("japanese_red_helmet", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_CHESTPLATE = ITEMS.register("japanese_red_chestplate", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_LEGGINGS = ITEMS.register("japanese_red_leggings", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_RED_BOOTS = ITEMS.register("japanese_red_boots", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> MAYAN_QUEST_CROWN = ITEMS.register("mayan_quest_crown", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Wands
    public static final RegistryObject<Item> WAND_SUMMONING = ITEMS.register("wand_summoning", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAND_NEGATION = ITEMS.register("wand_negation", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> WAND_CREATIVE = ITEMS.register("wand_creative", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> TUNING_FORK = ITEMS.register("tuning_fork", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Tools
    public static final RegistryObject<Item> NORMAN_AXE = ITEMS.register("norman_axe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_SHOVEL = ITEMS.register("norman_shovel", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_PICKAXE = ITEMS.register("norman_pickaxe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_HOE = ITEMS.register("norman_hoe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_SWORD = ITEMS.register("norman_sword", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> MAYAN_AXE = ITEMS.register("mayan_axe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_SHOVEL = ITEMS.register("mayan_shovel", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_PICKAXE = ITEMS.register("mayan_pickaxe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_HOE = ITEMS.register("mayan_hoe", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_MACE = ITEMS.register("mayan_mace", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> BYZANTINE_MACE = ITEMS.register("byzantine_mace", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_SWORD = ITEMS.register("japanese_sword", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BOW = ITEMS.register("japanese_bow", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Amulets
    public static final RegistryObject<Item> AMULET_SKOLL_HATI = ITEMS.register("amulet_skoll_hati", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_YGGDRASIL = ITEMS.register("amulet_yggdrasil", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_ALCHEMIST = ITEMS.register("amulet_alchemist", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> AMULET_VISHNU = ITEMS.register("amulet_vishnu", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Wallet
    public static final RegistryObject<Item> ITEM_MILL_PURSE = ITEMS.register("mill_purse", () -> new MillWalletItem(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB).stacksTo(1)));

    //Sign
    public static final RegistryObject<Item> ITEM_MILL_SIGN = ITEMS.register("mill_sign", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    //Parchments
    public static final RegistryObject<Item> NORMAN_VILLAGER_PARCHMENT = ITEMS.register("norman_villager_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_BUILDING_PARCHMENT = ITEMS.register("norman_building_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_ITEM_PARCHMENT = ITEMS.register("norman_item_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> NORMAN_ALL_PARCHMENT = ITEMS.register("norman_all_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> BYZANTINE_VILLAGER_PARCHMENT = ITEMS.register("byzantine_villager_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_BUILDING_PARCHMENT = ITEMS.register("byzantine_building_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_ITEM_PARCHMENT = ITEMS.register("byzantine_item_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> BYZANTINE_ALL_PARCHMENT = ITEMS.register("byzantine_all_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> HINDI_VILLAGER_PARCHMENT = ITEMS.register("hindi_villager_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> HINDI_BUILDING_PARCHMENT = ITEMS.register("hindi_building_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> HINDI_ITEM_PARCHMENT = ITEMS.register("hindi_item_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> HINDI_ALL_PARCHMENT = ITEMS.register("hindi_all_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> MAYAN_VILLAGER_PARCHMENT = ITEMS.register("mayan_villager_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_BUILDING_PARCHMENT = ITEMS.register("mayan_building_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_ITEM_PARCHMENT = ITEMS.register("mayan_item_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> MAYAN_ALL_PARCHMENT = ITEMS.register("mayan_all_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));

    public static final RegistryObject<Item> JAPANESE_VILLAGER_PARCHMENT = ITEMS.register("japanese_villager_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_BUILDING_PARCHMENT = ITEMS.register("japanese_building_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_ITEM_PARCHMENT = ITEMS.register("japanese_item_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    public static final RegistryObject<Item> JAPANESE_ALL_PARCHMENT = ITEMS.register("japanese_all_parchment", () -> new Item(new Item.Properties().tab(MillCreativeModeTab.MILL_TAB)));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

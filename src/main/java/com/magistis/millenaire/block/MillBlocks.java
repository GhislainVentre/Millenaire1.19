package com.magistis.millenaire.block;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.block.custom.MillCropBlock;
import com.magistis.millenaire.item.MillCreativeModeTab;
import com.magistis.millenaire.item.MillItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MillBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Millenaire.MOD_ID);

    // Crops
    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("rice_crop", () -> new MillCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT), MillCropBlock.CropType.RICE));
    public static final RegistryObject<Block> MAIZE_CROP = BLOCKS.register("maize_crop", () -> new MillCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT), MillCropBlock.CropType.MAIZE));
    public static final RegistryObject<Block> TURMERIC_CROP = BLOCKS.register("turmeric_crop", () -> new MillCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT), MillCropBlock.CropType.TURMERIC));
    public static final RegistryObject<Block> VINE_CROP = BLOCKS.register("vine_crop", () -> new MillCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT), MillCropBlock.CropType.GRAPES));

    // Decorative blocks
    public static final RegistryObject<Block> GOLD_ORNAMENT = registerBlock("gold_ornament", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).requiresCorrectToolForDrops()), MillCreativeModeTab.MILL_TAB);
    // public static final RegistryObject<Block> MUD_BRICK = BLOCKS.register("mud_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistryObject<Block> THATCH = registerBlock("thatch", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()), MillCreativeModeTab.MILL_TAB);
    public static final RegistryObject<Block> PLAIN_TIMBER_FRAME = registerBlock("plain_timber_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()), MillCreativeModeTab.MILL_TAB);
    public static final RegistryObject<Block> CROSS_TIMBER_FRAME = registerBlock("cross_timber_frame", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).requiresCorrectToolForDrops()), MillCreativeModeTab.MILL_TAB);

    // Chest
    public static final RegistryObject<Block> CHEST = BLOCKS.register("chest", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHEST)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return MillItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

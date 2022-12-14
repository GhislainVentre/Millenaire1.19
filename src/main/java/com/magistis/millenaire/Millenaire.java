/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire;

import com.magistis.millenaire.block.MillBlocks;
import com.magistis.millenaire.entity.MillEntityTypes;
import com.magistis.millenaire.entity.CustomVanillaVillagers;
import com.magistis.millenaire.entity.client.MillVillagerRenderer;
import com.magistis.millenaire.item.MillItems;

import com.magistis.millenaire.util.MillItemProperties;
import com.magistis.millenaire.world.feature.MillConfiguredFeatures;
import com.magistis.millenaire.world.feature.MillPlacedFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Millenaire.MOD_ID)
public class Millenaire
{
    public static final String MOD_ID = "millenaire";
    public static final String NAME = "Mill\u00e9naire";
    public static final String VERSION = "9.0.0";
    public static final String GUIFACTORY = "org.millenaire.gui.MillGuiFactory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Millenaire()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        MillBlocks.register(modEventBus);
        MillItems.register(modEventBus);
        CustomVanillaVillagers.register(modEventBus);
        MillConfiguredFeatures.register(modEventBus);
        MillPlacedFeatures.register(modEventBus);
        MillEntityTypes.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            CustomVanillaVillagers.registerPOIs();

        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            MillItemProperties.addCustomProperties();
            EntityRenderers.register(MillEntityTypes.BYZANTINE_ARTISAN0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_ARTISAN_WIFE0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_BARON0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_BARON1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_BOY0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_CENTURIO0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_CENTURIO1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FARMER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FARMER1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FARMILLER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FARMILLER1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FRAU0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FRAU1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FRAU2.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FRAU3.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_FRAU4.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_GIRL0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_KEEPER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_KEEPER1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_KEEPER2.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_KEEPER3.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_LUMBERMAN0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_LUMBERMAN1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_MERCHANT0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_MINER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_MINER1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_MINER2.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_PAPAS0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_PAPAS1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_PAPAS2.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_PATRIARCH0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_RICH_WIFE0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SHEPARD0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SHEPHERD_WIFE0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SILK_SMUGGLER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SMITH0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SMITH1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_SOLDIER0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_WIFE0.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_WIFE1.get(), MillVillagerRenderer::new);
            EntityRenderers.register(MillEntityTypes.BYZANTINE_WIFE2.get(), MillVillagerRenderer::new);


        }
    }
}

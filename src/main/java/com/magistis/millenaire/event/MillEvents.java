/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.event;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entity.CustomVanillaVillagers;
import com.magistis.millenaire.entity.MillEntityTypes;
import com.magistis.millenaire.entity.client.MillVillagerModel;
import com.magistis.millenaire.entity.client.MillVillagerRenderer;
import com.magistis.millenaire.entity.custom.MillVillagerEntity;
import com.magistis.millenaire.item.MillItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Millenaire.MOD_ID)
public class MillEvents {

    @Mod.EventBusSubscriber(modid = Millenaire.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void addCustomTrades(VillagerTradesEvent event) {
            if(event.getType() == CustomVanillaVillagers.CHIEF.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(MillItems.RICE.get(), 12);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), stack, 10, 8, 0.02f));
            }
        }
    }
    @Mod.EventBusSubscriber(modid = Millenaire.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class MillEventBusEvents {

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(MillEntityTypes.BYZANTINE_ARTISAN0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_ARTISAN_WIFE0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_BARON0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_BARON1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_BOY0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_CENTURIO0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_CENTURIO1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FARMER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FARMER1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FARMILLER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FARMILLER1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FRAU0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FRAU1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FRAU2.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FRAU3.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_FRAU4.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_GIRL0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_KEEPER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_KEEPER1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_KEEPER2.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_KEEPER3.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_LUMBERMAN0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_LUMBERMAN1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_MERCHANT0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_MINER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_MINER1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_MINER2.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_PAPAS0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_PAPAS1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_PAPAS2.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_PATRIARCH0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_RICH_WIFE0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SHEPARD0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SHEPHERD_WIFE0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SILK_SMUGGLER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SMITH0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SMITH1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_SOLDIER0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_WIFE0.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_WIFE1.get(), MillVillagerEntity.setAttributes());
            event.put(MillEntityTypes.BYZANTINE_WIFE2.get(), MillVillagerEntity.setAttributes());

        }

        @SubscribeEvent
        @OnlyIn(Dist.CLIENT)
        public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(MillVillagerModel.VILLAGER_LAYER, MillVillagerModel::createMesh);
        }

        @SubscribeEvent
        @OnlyIn(Dist.CLIENT)
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_ARTISAN0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_ARTISAN_WIFE0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_BARON0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_BARON1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_BOY0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_CENTURIO0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_CENTURIO1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FARMER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FARMER1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FARMILLER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FARMILLER1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FRAU0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FRAU1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FRAU2.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FRAU3.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_FRAU4.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_GIRL0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_KEEPER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_KEEPER1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_KEEPER2.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_KEEPER3.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_LUMBERMAN0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_LUMBERMAN1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_MERCHANT0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_MINER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_MINER1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_MINER2.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_PAPAS0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_PAPAS1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_PAPAS2.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_PATRIARCH0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_RICH_WIFE0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SHEPARD0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SHEPHERD_WIFE0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SILK_SMUGGLER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SMITH0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SMITH1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_SOLDIER0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_WIFE0.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_WIFE1.get(), MillVillagerRenderer::new);
            event.registerEntityRenderer(MillEntityTypes.BYZANTINE_WIFE2.get(), MillVillagerRenderer::new);

        }
    }
}

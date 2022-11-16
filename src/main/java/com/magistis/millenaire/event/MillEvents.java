package com.magistis.millenaire.event;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entities.MillVillagers;
import com.magistis.millenaire.item.MillItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Millenaire.MOD_ID)
public class MillEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == MillVillagers.CHIEF.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(MillItems.RICE.get(), 12);
            int villagerLeve = 1;

            trades.get(villagerLeve).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), stack, 10, 8, 0.02f));
        }
    }
}

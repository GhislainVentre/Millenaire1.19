/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.item.MillArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;

public class MillMayanQuestCrownItem extends ArmorItem {
    public MillMayanQuestCrownItem(Properties properties) {
        super(MillArmorMaterials.MAYAN_QUEST, EquipmentSlot.HEAD, properties);
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {

        return super.onEntityItemUpdate(stack, entity);
    }
}

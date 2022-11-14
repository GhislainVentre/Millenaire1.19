package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entities.MillEntity;
import com.magistis.millenaire.item.MillArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;

public class MillMayanQuestCrownItem extends ArmorItem {
    public MillMayanQuestCrownItem(Properties properties) {
        super(MillArmorMaterials.MAYAN_QUEST, EquipmentSlot.HEAD, properties);
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {

        return super.onEntityItemUpdate(stack, entity);
    }
}

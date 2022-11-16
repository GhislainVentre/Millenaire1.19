package com.magistis.millenaire.item;

import com.magistis.millenaire.Millenaire;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public record MillArmorMaterial(String name, int durability, int[] defense, int enchantability, SoundEvent equip_sound, float toughness, float knockback_resistance, Supplier<Ingredient> repair_material) implements ArmorMaterial {

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipment_slot) {
        return getDurabilityForSlot();
    }

    public int getDurabilityForSlot() {
        return this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipment_slot) {
        return switch (equipment_slot) {
            case HEAD -> this.defense[0];
            case CHEST -> this.defense[1];
            case LEGS -> this.defense[2];
            case FEET -> this.defense[3];
            default -> 0;
        };
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equip_sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repair_material.get();
    }

    @Override
    public String getName() {
        return Millenaire.MOD_ID + ":" + name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockback_resistance;
    }
}

/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Supplier;

public class MillFoods {

    private static final Supplier<MobEffectInstance> RCIDER = () -> new MobEffectInstance(MobEffects.REGENERATION, 15*20, 0);
    private static final Supplier<MobEffectInstance> RCALVA = () -> new MobEffectInstance(MobEffects.REGENERATION, 30*20, 0);
    private static final Supplier<MobEffectInstance> RRASGULLA = () -> new MobEffectInstance(MobEffects.REGENERATION, 30*20, -1);
    private static final Supplier<MobEffectInstance> RCACAUHAA = () -> new MobEffectInstance(MobEffects.REGENERATION, 30*20, 0);
    private static final Supplier<MobEffectInstance> RWINE = () -> new MobEffectInstance(MobEffects.REGENERATION, 10*20, 0);
    private static final Supplier<MobEffectInstance> RMALSAVIA_WINE = () -> new MobEffectInstance(MobEffects.REGENERATION, 15*20, 0);
    private static final Supplier<MobEffectInstance> RSAKE = () -> new MobEffectInstance(MobEffects.REGENERATION, 30*20, 0);


    private static final Supplier<MobEffectInstance> CCIDER = () -> new MobEffectInstance(MobEffects.CONFUSION, 5*20, 0);
    private static final Supplier<MobEffectInstance> CCALVA = () -> new MobEffectInstance(MobEffects.CONFUSION, 10*20, 0);
    private static final Supplier<MobEffectInstance> CCACAUHAA = () -> new MobEffectInstance(MobEffects.CONFUSION, 3*20, 0);
    private static final Supplier<MobEffectInstance> CWINE = () -> new MobEffectInstance(MobEffects.CONFUSION, 5*20, 0);
    private static final Supplier<MobEffectInstance> CMALSAVIA_WINE = () -> new MobEffectInstance(MobEffects.CONFUSION, 5*20, 0);
    private static final Supplier<MobEffectInstance> CSAKE = () -> new MobEffectInstance(MobEffects.CONFUSION, 10*20, 0);


    public static final FoodProperties CIDER_APPLE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.05F).build();
    public static final FoodProperties CIDER = (new FoodProperties.Builder()).effect(RCIDER, 1.0F).effect(CCIDER, 0.8F).alwaysEat().build();
    public static final FoodProperties CALVA = (new FoodProperties.Builder()).effect(RCALVA,1.0F).effect(CCALVA,0.8F).alwaysEat().build();
    public static final FoodProperties TRIPES = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties BOUDIN_NOIR = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties VEG_CURRY = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties MURGH_CURRY = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties RASGULLA = (new FoodProperties.Builder()).effect(RRASGULLA,1.0F).alwaysEat().build();
    public static final FoodProperties CACAUHAA = (new FoodProperties.Builder()).effect(RCACAUHAA,1.0F).effect(CCACAUHAA,0.8F).alwaysEat().build();
    public static final FoodProperties MASA = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties WAH = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties WINE = (new FoodProperties.Builder()).effect(RWINE,1.0F).effect(CWINE,0.8F).alwaysEat().build();
    public static final FoodProperties MALSAVIA_WINE = (new FoodProperties.Builder()).effect(RMALSAVIA_WINE,1.0F).effect(CMALSAVIA_WINE,0.8F).alwaysEat().build();
    public static final FoodProperties FETA = (new FoodProperties.Builder()).alwaysEat().build();
    public static final FoodProperties SOUVLAKI = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
    public static final FoodProperties SAKE = (new FoodProperties.Builder()).effect(RSAKE,1.0F).effect(CSAKE,0.8F).alwaysEat().build();
    public static final FoodProperties UDON = (new FoodProperties.Builder()).nutrition(8).saturationMod(0.8F).build();
    public static final FoodProperties IKAYAKI = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).build();
}

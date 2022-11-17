/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.client.renderer;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.client.model.MillEntityModel;
import com.magistis.millenaire.entity.MillEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MillEntityRenderer extends MobRenderer<MillEntity, MillEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Millenaire.MOD_ID, "textures/entities/example_entity.png");

    public MillEntityRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new MillEntityModel(ctx.bakeLayer(MillEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(MillEntity entity) {
        return TEXTURE;
    }
}

package com.magistis.millenaire.entity.client;

import com.magistis.millenaire.entity.custom.MillVillagerEntity;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.Pose;
import org.jetbrains.annotations.NotNull;

/**
 * Citizen model.
 */
public class CitizenModel<T extends MillVillagerEntity> extends HumanoidModel<MillVillagerEntity>
{
    public CitizenModel(final ModelPart part)
    {
        super(part, RenderType::entityCutoutNoCull);
    }

    @Override
    public void setupAnim(@NotNull final MillVillagerEntity citizen, float f1, float f2, float f3, float f4, float f5)
    {
        super.setupAnim(citizen, f1, f2, f3, f4, f5);
        if (body.xRot == 0)
        {
            body.xRot = getActualRotation(citizen);
        }

        if (head.xRot == 0)
        {
            head.xRot = getActualRotation(citizen);
        }
    }

    public static LayerDefinition createMesh()
    {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    /**
     * Override to change body rotation.
     *
     * @return the rotation.
     */
    public float getActualRotation(@NotNull final MillVillagerEntity entity)
    {
        return 0;
    }
}

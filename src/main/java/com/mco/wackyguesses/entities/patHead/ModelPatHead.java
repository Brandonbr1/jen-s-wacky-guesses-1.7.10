package com.mco.wackyguesses.entities.patHead;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Pat's Head - TheMinecraftOverlord
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelPatHead extends ModelBase
{
    public ModelRenderer BottomHalf;
    public ModelRenderer TopHalf;

    public ModelPatHead() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BottomHalf = new ModelRenderer(this, 0, 0);
        this.BottomHalf.setRotationPoint(-8.0F, 7.0F, -8.0F);
        this.BottomHalf.addBox(0.0F, 9.0F, 0.0F, 16, 8, 16, 0.0F);
        this.TopHalf = new ModelRenderer(this, 0, 24);
        this.TopHalf.setRotationPoint(15.5F, 9.0F, 14.0F);
        this.TopHalf.addBox(-15.5F, -8.0F, -14.0F, 16, 8, 16, 0.0F);
        this.BottomHalf.addChild(this.TopHalf);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.BottomHalf.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.TopHalf.rotateAngleZ = Math.abs(MathHelper.cos(limbSwing * 0.1662F) * limbSwingAmount);
    }

}
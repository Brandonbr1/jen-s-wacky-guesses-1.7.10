package com.mco.wackyguesses.entities.chocolate.sphere;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

/**
 * ModelSphericalChoco - TheMCO
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelSphericalChoco extends ModelBase {
    public ModelRenderer SphereA;
    public ModelRenderer SphereB;
    public ModelRenderer SphereC;
    public ModelRenderer SphereD;

    public ModelSphericalChoco() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.SphereA = new ModelRenderer(this, 0, 0);
        this.SphereA.setRotationPoint(0.0F, 17.0F, 0.0F);
        this.SphereA.addBox(-6.0F, -6.0F, -6.0F, 12, 12, 12, 0.0F);
        this.SphereD = new ModelRenderer(this, 0, 0);
        this.SphereD.setRotationPoint(-5.0F, -5.0F, -7.0F);
        this.SphereD.addBox(0.0F, 0.0F, 0.0F, 10, 10, 14, 0.0F);
        this.SphereB = new ModelRenderer(this, 0, 0);
        this.SphereB.setRotationPoint(-5.0F, -7.0F, -5.0F);
        this.SphereB.addBox(0.0F, 0.0F, 0.0F, 10, 14, 10, 0.0F);
        this.SphereC = new ModelRenderer(this, 0, 0);
        this.SphereC.setRotationPoint(-7.0F, -5.0F, -5.0F);
        this.SphereC.addBox(0.0F, 0.0F, 0.0F, 14, 10, 10, 0.0F);
        this.SphereA.addChild(this.SphereD);
        this.SphereA.addChild(this.SphereB);
        this.SphereA.addChild(this.SphereC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.SphereA.render(f5);
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
        this.SphereA.rotateAngleX = Math.abs(MathHelper.sin(limbSwing * 0.6662F) * 7F * limbSwingAmount);
    }




}
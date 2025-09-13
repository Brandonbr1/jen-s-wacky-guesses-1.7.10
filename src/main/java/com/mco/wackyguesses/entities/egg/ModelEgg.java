package com.mco.wackyguesses.entities.egg;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelEgg - TheMCO
 * Created using Tabula 4.1.1
 */
public class ModelEgg extends ModelBase {
    public ModelRenderer EggWhite;
    public ModelRenderer EggYolkA;
    public ModelRenderer RLeg;
    public ModelRenderer LegA;
    public ModelRenderer LArm;
    public ModelRenderer RArm;
    public ModelRenderer EggYolkB;
    public ModelRenderer EggYolkC;
    public ModelRenderer EggYolkD;
    public ModelRenderer EggYolkE;

    public ModelEgg() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.EggYolkB = new ModelRenderer(this, 0, 40);
        this.EggYolkB.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.EggYolkB.addBox(2.0F, 0.0F, 0.0F, 16, 13, 1, 0.0F);
        this.EggYolkE = new ModelRenderer(this, 0, 40);
        this.EggYolkE.setRotationPoint(5.0F, 5.0F, -1.0F);
        this.EggYolkE.addBox(2.0F, -1.0F, -1.0F, 8, 8, 1, 0.0F);
        this.RLeg = new ModelRenderer(this, 37, 32);
        this.RLeg.setRotationPoint(21.0F, 27.0F, 0.0F);
        this.RLeg.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
        this.LegA = new ModelRenderer(this, 37, 32);
        this.LegA.setRotationPoint(6.0F, 30.0F, 0.0F);
        this.LegA.addBox(0.0F, -3.0F, 0.0F, 1, 9, 1, 0.0F);
        this.RArm = new ModelRenderer(this, 37, 37);
        this.RArm.setRotationPoint(24.0F, 14.0F, 1.0F);
        this.RArm.addBox(0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.EggYolkD = new ModelRenderer(this, 0, 40);
        this.EggYolkD.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.EggYolkD.addBox(3.0F, 0.0F, 0.0F, 13, 13, 1, 0.0F);
        this.LArm = new ModelRenderer(this, 37, 37);
        this.LArm.setRotationPoint(2.0F, 14.0F, 1.0F);
        this.LArm.addBox(0.0F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        this.EggYolkC = new ModelRenderer(this, 0, 40);
        this.EggYolkC.setRotationPoint(2.0F, -1.0F, 0.0F);
        this.EggYolkC.addBox(2.0F, 0.0F, 0.0F, 13, 17, 1, 0.0F);
        this.EggWhite = new ModelRenderer(this, 0, 0);
        this.EggWhite.setRotationPoint(-15.0F, -12.0F, 0.0F);
        this.EggWhite.addBox(0.0F, 0.0F, 0.0F, 30, 30, 1, 0.0F);
        this.EggYolkA = new ModelRenderer(this, 0, 40);
        this.EggYolkA.setRotationPoint(4.0F, 7.0F, -1.0F);
        this.EggYolkA.addBox(3.0F, 0.0F, 0.0F, 15, 15, 1, 0.0F);
        this.EggYolkA.addChild(this.EggYolkB);
        this.EggYolkA.addChild(this.EggYolkE);
        this.EggWhite.addChild(this.RLeg);
        this.EggWhite.addChild(this.LegA);
        this.EggWhite.addChild(this.RArm);
        this.EggYolkA.addChild(this.EggYolkD);
        this.EggWhite.addChild(this.LArm);
        this.EggYolkA.addChild(this.EggYolkC);
        this.EggWhite.addChild(this.EggYolkA);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.EggWhite.render(f5);
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
        this.LegA.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.8662F) * 1.4F * limbSwingAmount;
        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LArm.rotateAngleX = MathHelper.cos(limbSwing * -0.8662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

}
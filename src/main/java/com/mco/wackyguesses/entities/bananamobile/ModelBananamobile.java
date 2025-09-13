package com.mco.wackyguesses.entities.bananamobile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelBananamobile - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelBananamobile extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer MainBodyA;
    public ModelRenderer MainBodyC;
    public ModelRenderer LowerBodyA;
    public ModelRenderer UpperBodyA;
    public ModelRenderer UpperBodyB;
    public ModelRenderer UpperBodyC;
    public ModelRenderer UpperBodyD;
    public ModelRenderer UpperBodyE;
    public ModelRenderer FrontAxel;
    public ModelRenderer BackAxel;
    public ModelRenderer LowerBodyB;
    public ModelRenderer LowerBodyC;
    public ModelRenderer LowerBodyD;
    public ModelRenderer LowerBodyE;
    public ModelRenderer LowerBodyE_1;
    public ModelRenderer LWheelBase1;
    public ModelRenderer RWheelBaseA;
    public ModelRenderer LWheelA;
    public ModelRenderer LWheelB;
    public ModelRenderer LWheelC;
    public ModelRenderer LWheelD;
    public ModelRenderer LWheelStrut1A;
    public ModelRenderer LWheelStrut1B;
    public ModelRenderer RWheelA;
    public ModelRenderer RWheelC;
    public ModelRenderer RWheelB;
    public ModelRenderer RWheelD;
    public ModelRenderer RWheelStrutA;
    public ModelRenderer RWheelStrut1B;
    public ModelRenderer LWheelBase1_1;
    public ModelRenderer RWheelBaseA_1;
    public ModelRenderer LWheelA_1;
    public ModelRenderer LWheelB_1;
    public ModelRenderer LWheelC_1;
    public ModelRenderer LWheelD_1;
    public ModelRenderer LWheelStrut1A_1;
    public ModelRenderer LWheelStrut1B_1;
    public ModelRenderer RWheelA_1;
    public ModelRenderer RWheelC_1;
    public ModelRenderer RWheelB_1;
    public ModelRenderer RWheelD_1;
    public ModelRenderer RWheelStrutA_1;
    public ModelRenderer RWheelStrut1B_1;

    public ModelBananamobile() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LWheelStrut1B_1 = new ModelRenderer(this, 7, 55);
        this.LWheelStrut1B_1.setRotationPoint(-1.0F, 0.0F, 6.0F);
        this.LWheelStrut1B_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.LWheelStrut1B_1, -0.7853981633974483F, 0.0F, 0.0F);
        this.RWheelC_1 = new ModelRenderer(this, 7, 55);
        this.RWheelC_1.setRotationPoint(1.0F, 0.0F, 6.0F);
        this.RWheelC_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.FrontAxel = new ModelRenderer(this, 7, 55);
        this.FrontAxel.setRotationPoint(-13.0F, -21.5F, 11.0F);
        this.FrontAxel.addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
        this.LWheelD = new ModelRenderer(this, 7, 55);
        this.LWheelD.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.LWheelD.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LWheelStrut1B = new ModelRenderer(this, 7, 55);
        this.LWheelStrut1B.setRotationPoint(-1.0F, 0.0F, 6.0F);
        this.LWheelStrut1B.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.LWheelStrut1B, -0.7853981633974483F, 0.0F, 0.0F);
        this.UpperBodyC = new ModelRenderer(this, 4, 2);
        this.UpperBodyC.setRotationPoint(2.0F, -12.0F, -3.0F);
        this.UpperBodyC.addBox(-12.0F, -17.0F, 5.0F, 10, 5, 5, 0.0F);
        this.setRotateAngle(this.UpperBodyC, 0.10471975511965977F, 0.0F, 0.0F);
        this.MainBodyC = new ModelRenderer(this, 2, 2);
        this.MainBodyC.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.MainBodyC.addBox(-13.0F, -18.0F, -2.0F, 18, 19, 8, 0.0F);
        this.LowerBodyE_1 = new ModelRenderer(this, 4, 42);
        this.LowerBodyE_1.setRotationPoint(4.5F, -2.5F, -23.0F);
        this.LowerBodyE_1.addBox(-13.0F, -18.0F, 9.0F, 3, 9, 1, 0.0F);
        this.setRotateAngle(this.LowerBodyE_1, -1.2747884856566583F, 0.0F, 0.0F);
        this.RWheelStrutA_1 = new ModelRenderer(this, 7, 55);
        this.RWheelStrutA_1.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.RWheelStrutA_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.RWheelStrutA_1, 0.7853981633974483F, 0.0F, 0.0F);
        this.RWheelStrut1B_1 = new ModelRenderer(this, 7, 55);
        this.RWheelStrut1B_1.setRotationPoint(1.0F, 0.0F, 5.5F);
        this.RWheelStrut1B_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.RWheelStrut1B_1, -0.7853981633974483F, 0.0F, 0.0F);
        this.LWheelBase1 = new ModelRenderer(this, 10, 6);
        this.LWheelBase1.setRotationPoint(-1.0F, -2.0F, -2.5F);
        this.LWheelBase1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        this.RWheelStrut1B = new ModelRenderer(this, 7, 55);
        this.RWheelStrut1B.setRotationPoint(1.0F, 0.0F, 5.5F);
        this.RWheelStrut1B.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.RWheelStrut1B, -0.7853981633974483F, 0.0F, 0.0F);
        this.LWheelBase1_1 = new ModelRenderer(this, 10, 6);
        this.LWheelBase1_1.setRotationPoint(-1.0F, -2.0F, -2.5F);
        this.LWheelBase1_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        this.RWheelBaseA = new ModelRenderer(this, 10, 6);
        this.RWheelBaseA.setRotationPoint(16.0F, -2.0F, -2.5F);
        this.RWheelBaseA.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        this.MainBody = new ModelRenderer(this, 2, 2);
        this.MainBody.setRotationPoint(-5.0F, 8.0F, 0.0F);
        this.MainBody.addBox(-13.0F, -18.0F, -2.0F, 16, 23, 10, 0.0F);
        this.setRotateAngle(this.MainBody, -1.593485607070823F, 3.141592653589793F, 0.0F);
        this.RWheelA = new ModelRenderer(this, 7, 55);
        this.RWheelA.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.RWheelA.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.RWheelD = new ModelRenderer(this, 7, 55);
        this.RWheelD.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.RWheelD.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.UpperBodyB = new ModelRenderer(this, 4, 2);
        this.UpperBodyB.setRotationPoint(1.0F, -8.0F, -2.5F);
        this.UpperBodyB.addBox(-12.0F, -17.0F, 3.0F, 12, 5, 7, 0.0F);
        this.setRotateAngle(this.UpperBodyB, 0.045553093477052F, 0.0F, 0.0F);
        this.LowerBodyD = new ModelRenderer(this, 4, 2);
        this.LowerBodyD.setRotationPoint(2.0F, 3.0F, -17.0F);
        this.LowerBodyD.addBox(-12.0F, -18.0F, 7.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(this.LowerBodyD, -0.8196066167365371F, 0.0F, 0.0F);
        this.RWheelStrutA = new ModelRenderer(this, 7, 55);
        this.RWheelStrutA.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.RWheelStrutA.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.RWheelStrutA, 0.7853981633974483F, 0.0F, 0.0F);
        this.LWheelC = new ModelRenderer(this, 7, 55);
        this.LWheelC.setRotationPoint(-1.0F, 0.0F, 6.0F);
        this.LWheelC.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.UpperBodyA = new ModelRenderer(this, 4, 2);
        this.UpperBodyA.setRotationPoint(1.0F, -3.0F, -3.0F);
        this.UpperBodyA.addBox(-13.0F, -18.0F, 2.0F, 14, 6, 9, 0.0F);
        this.BackAxel = new ModelRenderer(this, 7, 55);
        this.BackAxel.setRotationPoint(-13.0F, 3.5F, 11.0F);
        this.BackAxel.addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
        this.RWheelC = new ModelRenderer(this, 7, 55);
        this.RWheelC.setRotationPoint(1.0F, 0.0F, 6.0F);
        this.RWheelC.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.LowerBodyC = new ModelRenderer(this, 4, 2);
        this.LowerBodyC.setRotationPoint(1.0F, 4.0F, -10.0F);
        this.LowerBodyC.addBox(-12.0F, -18.0F, 4.0F, 8, 7, 6, 0.0F);
        this.setRotateAngle(this.LowerBodyC, -0.5009094953223726F, 0.0F, 0.0F);
        this.RWheelA_1 = new ModelRenderer(this, 7, 55);
        this.RWheelA_1.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.RWheelA_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.MainBodyA = new ModelRenderer(this, 4, 2);
        this.MainBodyA.setRotationPoint(2.0F, 2.0F, -1.0F);
        this.MainBodyA.addBox(-13.0F, -18.0F, -2.0F, 12, 19, 12, 0.0F);
        this.RWheelBaseA_1 = new ModelRenderer(this, 10, 6);
        this.RWheelBaseA_1.setRotationPoint(16.0F, -2.0F, -2.5F);
        this.RWheelBaseA_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        this.UpperBodyD = new ModelRenderer(this, 4, 2);
        this.UpperBodyD.setRotationPoint(1.0F, -16.0F, -3.5F);
        this.UpperBodyD.addBox(-10.0F, -15.0F, 6.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(this.UpperBodyD, 0.13962634015954636F, 0.0F, 0.0F);
        this.LWheelB_1 = new ModelRenderer(this, 7, 55);
        this.LWheelB_1.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.LWheelB_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LowerBodyA = new ModelRenderer(this, 4, 2);
        this.LowerBodyA.setRotationPoint(2.0F, 20.0F, -1.0F);
        this.LowerBodyA.addBox(-13.0F, -18.0F, -2.0F, 12, 7, 12, 0.0F);
        this.RWheelB = new ModelRenderer(this, 7, 55);
        this.RWheelB.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.RWheelB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LWheelStrut1A_1 = new ModelRenderer(this, 7, 55);
        this.LWheelStrut1A_1.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.LWheelStrut1A_1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.LWheelStrut1A_1, 0.7853981633974483F, 0.0F, 0.0F);
        this.LowerBodyE = new ModelRenderer(this, 15, 42);
        this.LowerBodyE.setRotationPoint(3.0F, -2.0F, -20.0F);
        this.LowerBodyE.addBox(-12.0F, -18.0F, 9.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(this.LowerBodyE, -1.1383037381507017F, 0.0F, 0.0F);
        this.LWheelD_1 = new ModelRenderer(this, 7, 55);
        this.LWheelD_1.setRotationPoint(-1.0F, 6.0F, 0.0F);
        this.LWheelD_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LWheelA = new ModelRenderer(this, 7, 55);
        this.LWheelA.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.LWheelA.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.LWheelStrut1A = new ModelRenderer(this, 7, 55);
        this.LWheelStrut1A.setRotationPoint(-1.0F, 0.5F, 0.0F);
        this.LWheelStrut1A.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.LWheelStrut1A, 0.7853981633974483F, 0.0F, 0.0F);
        this.LWheelB = new ModelRenderer(this, 7, 55);
        this.LWheelB.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.LWheelB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LowerBodyB = new ModelRenderer(this, 4, 2);
        this.LowerBodyB.setRotationPoint(1.0F, 4.0F, -6.0F);
        this.LowerBodyB.addBox(-13.0F, -18.0F, 2.0F, 10, 6, 9, 0.0F);
        this.setRotateAngle(this.LowerBodyB, -0.22759093446006054F, 0.0F, 0.0F);
        this.UpperBodyE = new ModelRenderer(this, 28, 41);
        this.UpperBodyE.setRotationPoint(0.0F, -18.0F, -4.5F);
        this.UpperBodyE.addBox(-7.0F, -16.0F, 7.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(this.UpperBodyE, 0.13962634015954636F, 0.0F, 0.0F);
        this.LWheelC_1 = new ModelRenderer(this, 7, 55);
        this.LWheelC_1.setRotationPoint(-1.0F, 0.0F, 6.0F);
        this.LWheelC_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.RWheelB_1 = new ModelRenderer(this, 7, 55);
        this.RWheelB_1.setRotationPoint(1.0F, 6.0F, 0.0F);
        this.RWheelB_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.RWheelD_1 = new ModelRenderer(this, 7, 55);
        this.RWheelD_1.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.RWheelD_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
        this.LWheelA_1 = new ModelRenderer(this, 7, 55);
        this.LWheelA_1.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.LWheelA_1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.LWheelBase1_1.addChild(this.LWheelStrut1B_1);
        this.RWheelBaseA_1.addChild(this.RWheelC_1);
        this.MainBody.addChild(this.FrontAxel);
        this.LWheelBase1.addChild(this.LWheelD);
        this.LWheelBase1.addChild(this.LWheelStrut1B);
        this.MainBody.addChild(this.UpperBodyC);
        this.MainBody.addChild(this.MainBodyC);
        this.LowerBodyA.addChild(this.LowerBodyE_1);
        this.RWheelBaseA_1.addChild(this.RWheelStrutA_1);
        this.RWheelBaseA_1.addChild(this.RWheelStrut1B_1);
        this.FrontAxel.addChild(this.LWheelBase1);
        this.RWheelBaseA.addChild(this.RWheelStrut1B);
        this.BackAxel.addChild(this.LWheelBase1_1);
        this.FrontAxel.addChild(this.RWheelBaseA);
        this.RWheelBaseA.addChild(this.RWheelA);
        this.RWheelBaseA.addChild(this.RWheelD);
        this.MainBody.addChild(this.UpperBodyB);
        this.LowerBodyA.addChild(this.LowerBodyD);
        this.RWheelBaseA.addChild(this.RWheelStrutA);
        this.LWheelBase1.addChild(this.LWheelC);
        this.MainBody.addChild(this.UpperBodyA);
        this.MainBody.addChild(this.BackAxel);
        this.RWheelBaseA.addChild(this.RWheelC);
        this.LowerBodyA.addChild(this.LowerBodyC);
        this.RWheelBaseA_1.addChild(this.RWheelA_1);
        this.MainBody.addChild(this.MainBodyA);
        this.BackAxel.addChild(this.RWheelBaseA_1);
        this.MainBody.addChild(this.UpperBodyD);
        this.LWheelBase1_1.addChild(this.LWheelB_1);
        this.MainBody.addChild(this.LowerBodyA);
        this.RWheelBaseA.addChild(this.RWheelB);
        this.LWheelBase1_1.addChild(this.LWheelStrut1A_1);
        this.LowerBodyA.addChild(this.LowerBodyE);
        this.LWheelBase1_1.addChild(this.LWheelD_1);
        this.LWheelBase1.addChild(this.LWheelA);
        this.LWheelBase1.addChild(this.LWheelStrut1A);
        this.LWheelBase1.addChild(this.LWheelB);
        this.LowerBodyA.addChild(this.LowerBodyB);
        this.MainBody.addChild(this.UpperBodyE);
        this.LWheelBase1_1.addChild(this.LWheelC_1);
        this.RWheelBaseA_1.addChild(this.RWheelB_1);
        this.RWheelBaseA_1.addChild(this.RWheelD_1);
        this.LWheelBase1_1.addChild(this.LWheelA_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.MainBody.render(f5);
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
        this.BackAxel.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.FrontAxel.rotateAngleX = MathHelper.cos(limbSwing * 0.8662F) * 1.4F * limbSwingAmount;
    }

}
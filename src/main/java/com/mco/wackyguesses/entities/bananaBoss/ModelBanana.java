package com.mco.wackyguesses.entities.bananaBoss;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Banana - Undefined
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelBanana extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer LEye;
    public ModelRenderer REye;
    public ModelRenderer Mouth;
    public ModelRenderer MainBodyA;
    public ModelRenderer MainBodyB;
    public ModelRenderer MainBodyC;
    public ModelRenderer LowerBodyA;
    public ModelRenderer UpperBodyA;
    public ModelRenderer UpperBodyB;
    public ModelRenderer UpperBodyC;
    public ModelRenderer UpperBodyD;
    public ModelRenderer UpperBodyE;
    public ModelRenderer RLeg;
    public ModelRenderer LLeg;
    public ModelRenderer LArmA;
    public ModelRenderer RArmA;
    public ModelRenderer LowerBodyB;
    public ModelRenderer LowerBodyC;
    public ModelRenderer LowerBodyD;
    public ModelRenderer LowerBodyE;
    public ModelRenderer LowerBodyE_1;
    public ModelRenderer RFoot;
    public ModelRenderer RFoot_1;
    public ModelRenderer LArmB;
    public ModelRenderer RArmB;

    public ModelBanana() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.REye = new ModelRenderer(this, 15, 53);
        this.REye.setRotationPoint(1.0F, -24.0F, -4.0F);
        this.REye.addBox(0.0F, 0.0F, 0.0F, 6, 6, 0, 0.0F);
        this.MainBody = new ModelRenderer(this, 2, 2);
        this.MainBody.setRotationPoint(4.0F, -8.0F, 0.0F);
        this.MainBody.addBox(-13.0F, -18.0F, -2.0F, 16, 23, 10, 0.0F);
        this.setRotateAngle(this.MainBody, -0.13962634015954636F, 0.0F, 0.0F);
        this.RArmB = new ModelRenderer(this, 0, 0);
        this.RArmB.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.RArmB.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(this.RArmB, 0.0F, 1.132020552843522F, 0.0F);
        this.UpperBodyA = new ModelRenderer(this, 4, 2);
        this.UpperBodyA.setRotationPoint(1.0F, -3.0F, -3.0F);
        this.UpperBodyA.addBox(-13.0F, -18.0F, 2.0F, 14, 6, 9, 0.0F);
        this.LArmB = new ModelRenderer(this, 0, 0);
        this.LArmB.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.LArmB.addBox(-9.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(this.LArmB, 0.0F, -1.132020552843522F, 0.0F);
        this.MainBodyC = new ModelRenderer(this, 2, 2);
        this.MainBodyC.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.MainBodyC.addBox(-13.0F, -18.0F, -2.0F, 18, 19, 8, 0.0F);
        this.RFoot = new ModelRenderer(this, 0, 0);
        this.RFoot.setRotationPoint(-1.0F, 16.0F, 2.0F);
        this.RFoot.addBox(0.0F, 1.0F, -3.0F, 3, 1, 3, 0.0F);
        this.RFoot_1 = new ModelRenderer(this, 0, 0);
        this.RFoot_1.setRotationPoint(-1.0F, 16.0F, 2.0F);
        this.RFoot_1.addBox(0.0F, 1.0F, -3.0F, 3, 1, 3, 0.0F);
        this.LowerBodyC = new ModelRenderer(this, 4, 2);
        this.LowerBodyC.setRotationPoint(1.0F, 4.0F, -10.0F);
        this.LowerBodyC.addBox(-12.0F, -18.0F, 4.0F, 8, 7, 6, 0.0F);
        this.setRotateAngle(this.LowerBodyC, -0.5009094953223726F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 29, 50);
        this.Mouth.setRotationPoint(-5.0F, -16.0F, -6.0F);
        this.Mouth.addBox(-2.0F, 0.0F, 0.0F, 12, 13, 0, 0.0F);
        this.LEye = new ModelRenderer(this, 2, 53);
        this.LEye.setRotationPoint(-9.0F, -24.0F, -4.0F);
        this.LEye.addBox(0.0F, 0.0F, 0.0F, 6, 6, 0, 0.0F);
        this.LowerBodyE = new ModelRenderer(this, 15, 42);
        this.LowerBodyE.setRotationPoint(3.0F, -2.0F, -20.0F);
        this.LowerBodyE.addBox(-12.0F, -18.0F, 9.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(this.LowerBodyE, -1.1383037381507017F, 0.0F, 0.0F);
        this.UpperBodyD = new ModelRenderer(this, 4, 2);
        this.UpperBodyD.setRotationPoint(1.0F, -16.0F, -3.5F);
        this.UpperBodyD.addBox(-10.0F, -15.0F, 6.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(this.UpperBodyD, 0.13962634015954636F, 0.0F, 0.0F);
        this.LowerBodyA = new ModelRenderer(this, 4, 2);
        this.LowerBodyA.setRotationPoint(2.0F, 20.0F, -1.0F);
        this.LowerBodyA.addBox(-13.0F, -18.0F, -2.0F, 12, 7, 12, 0.0F);
        this.UpperBodyE = new ModelRenderer(this, 28, 41);
        this.UpperBodyE.setRotationPoint(0.0F, -18.0F, -4.5F);
        this.UpperBodyE.addBox(-7.0F, -16.0F, 7.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(this.UpperBodyE, 0.13962634015954636F, 0.0F, 0.0F);
        this.LowerBodyE_1 = new ModelRenderer(this, 4, 42);
        this.LowerBodyE_1.setRotationPoint(4.5F, -2.5F, -23.0F);
        this.LowerBodyE_1.addBox(-13.0F, -18.0F, 9.0F, 3, 9, 1, 0.0F);
        this.setRotateAngle(this.LowerBodyE_1, -1.2747884856566583F, 0.0F, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 0);
        this.RLeg.setRotationPoint(0.0F, 14.0F, 4.0F);
        this.RLeg.addBox(0.0F, -5.0F, 0.0F, 1, 22, 1, 0.0F);
        this.setRotateAngle(this.RLeg, 0.13962634015954636F, 0.0F, 0.0F);
        this.RArmA = new ModelRenderer(this, 0, 0);
        this.RArmA.setRotationPoint(4.0F, -7.0F, 0.0F);
        this.RArmA.addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(this.RArmA, 0.0F, 0.0F, -0.18256143975860686F);
        this.MainBodyB = new ModelRenderer(this, 4, 2);
        this.MainBodyB.setRotationPoint(5.0F, 4.0F, -3.0F);
        this.MainBodyB.addBox(-13.0F, -18.0F, -2.0F, 6, 15, 16, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 0);
        this.LLeg.setRotationPoint(-11.0F, 14.0F, 4.0F);
        this.LLeg.addBox(0.0F, -5.0F, 0.0F, 1, 22, 1, 0.0F);
        this.setRotateAngle(this.LLeg, 0.13962634015954636F, 0.0F, 0.0F);
        this.LowerBodyD = new ModelRenderer(this, 4, 2);
        this.LowerBodyD.setRotationPoint(2.0F, 3.0F, -17.0F);
        this.LowerBodyD.addBox(-12.0F, -18.0F, 7.0F, 6, 4, 4, 0.0F);
        this.setRotateAngle(this.LowerBodyD, -0.8196066167365371F, 0.0F, 0.0F);
        this.UpperBodyC = new ModelRenderer(this, 4, 2);
        this.UpperBodyC.setRotationPoint(2.0F, -12.0F, -3.0F);
        this.UpperBodyC.addBox(-12.0F, -17.0F, 5.0F, 10, 5, 5, 0.0F);
        this.setRotateAngle(this.UpperBodyC, 0.10471975511965977F, 0.0F, 0.0F);
        this.UpperBodyB = new ModelRenderer(this, 4, 2);
        this.UpperBodyB.setRotationPoint(1.0F, -8.0F, -2.5F);
        this.UpperBodyB.addBox(-12.0F, -17.0F, 3.0F, 12, 5, 7, 0.0F);
        this.setRotateAngle(this.UpperBodyB, 0.045553093477052F, 0.0F, 0.0F);
        this.LowerBodyB = new ModelRenderer(this, 4, 2);
        this.LowerBodyB.setRotationPoint(1.0F, 4.0F, -6.0F);
        this.LowerBodyB.addBox(-13.0F, -18.0F, 2.0F, 10, 6, 9, 0.0F);
        this.setRotateAngle(this.LowerBodyB, -0.22759093446006054F, 0.0F, 0.0F);
        this.LArmA = new ModelRenderer(this, 0, 0);
        this.LArmA.setRotationPoint(-15.0F, -7.0F, 2.0F);
        this.LArmA.addBox(-9.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
        this.setRotateAngle(this.LArmA, 0.0F, 0.0F, 0.18259072413887323F);
        this.MainBodyA = new ModelRenderer(this, 4, 2);
        this.MainBodyA.setRotationPoint(2.0F, 2.0F, -1.0F);
        this.MainBodyA.addBox(-13.0F, -18.0F, -2.0F, 12, 19, 12, 0.0F);
        this.RArmA.addChild(this.RArmB);
        this.MainBody.addChild(this.UpperBodyA);
        this.LArmA.addChild(this.LArmB);
        this.MainBody.addChild(this.MainBodyC);
        this.RLeg.addChild(this.RFoot);
        this.LLeg.addChild(this.RFoot_1);
        this.LowerBodyA.addChild(this.LowerBodyC);
        this.LowerBodyA.addChild(this.LowerBodyE);
        this.MainBody.addChild(this.UpperBodyD);
        this.MainBody.addChild(this.LowerBodyA);
        this.MainBody.addChild(this.UpperBodyE);
        this.LowerBodyA.addChild(this.LowerBodyE_1);
        this.MainBody.addChild(this.RLeg);
        this.MainBody.addChild(this.RArmA);
        this.MainBody.addChild(this.MainBodyB);
        this.MainBody.addChild(this.LLeg);
        this.LowerBodyA.addChild(this.LowerBodyD);
        this.MainBody.addChild(this.UpperBodyC);
        this.MainBody.addChild(this.UpperBodyB);
        this.LowerBodyA.addChild(this.LowerBodyB);
        this.MainBody.addChild(this.LArmA);
        this.MainBody.addChild(this.MainBodyA);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.REye.render(f5);
        this.MainBody.render(f5);
        this.Mouth.render(f5);
        this.LEye.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
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
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RArmA.rotateAngleY = MathHelper.cos(limbSwing * 0.8662F) * 1.4F * limbSwingAmount;
        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LArmA.rotateAngleY = MathHelper.cos(limbSwing * -0.8662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

}
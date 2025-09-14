package com.mco.wackyguesses.entities.octobot;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Octobot - TheMCO
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelOctobot extends ModelBase
{
    public ModelRenderer HeadA;
    public ModelRenderer HeadB;
    public ModelRenderer HeadC;
    public ModelRenderer HeadD;
    public ModelRenderer Leg1A;
    public ModelRenderer Leg2A;
    public ModelRenderer Leg3A;
    public ModelRenderer Leg4A;
    public ModelRenderer Leg5A;
    public ModelRenderer Leg6A;
    public ModelRenderer Leg7A;
    public ModelRenderer Leg8A;
    public ModelRenderer WheelStrut;
    public ModelRenderer LWheel;
    public ModelRenderer RWheel;
    public ModelRenderer Leg1B;
    public ModelRenderer Leg1C;
    public ModelRenderer Leg2B;
    public ModelRenderer Leg2C;
    public ModelRenderer Leg3B;
    public ModelRenderer Leg3C;
    public ModelRenderer Leg4B;
    public ModelRenderer Leg4C;
    public ModelRenderer Leg5B;
    public ModelRenderer Leg5C;
    public ModelRenderer Leg6B;
    public ModelRenderer Leg6C;
    public ModelRenderer Leg7B;
    public ModelRenderer Leg7C;
    public ModelRenderer Leg8B;
    public ModelRenderer Leg8C;

    public ModelOctobot() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Leg8A = new ModelRenderer(this, 0, 97);
        this.Leg8A.setRotationPoint(0.0F, 12.0F, 7.0F);
        this.Leg8A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg8A, -0.45971972497530644F, 1.5025539530419183F, 0.0F);
        this.Leg4B = new ModelRenderer(this, 0, 106);
        this.Leg4B.setRotationPoint(0.5F, 4.0F, 0.2F);
        this.Leg4B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg4B, 0.31869712141416456F, 0.0F, 0.0F);
        this.Leg3C = new ModelRenderer(this, 0, 116);
        this.Leg3C.setRotationPoint(0.5F, 7.0F, 0.5F);
        this.Leg3C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg3C, 0.5462880558742251F, 0.0F, 0.0F);
        this.WheelStrut = new ModelRenderer(this, 16, 0);
        this.WheelStrut.setRotationPoint(5.5F, 12.0F, 5.5F);
        this.WheelStrut.addBox(0.0F, 0.0F, 0.0F, 1, 11, 1, 0.0F);
        this.Leg6A = new ModelRenderer(this, 0, 97);
        this.Leg6A.setRotationPoint(5.0F, 13.0F, 10.0F);
        this.Leg6A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg6A, 0.45971972497530644F, -0.091106186954104F, 0.0F);
        this.Leg3B = new ModelRenderer(this, 0, 106);
        this.Leg3B.setRotationPoint(0.5F, 4.0F, 0.2F);
        this.Leg3B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg3B, 0.31869712141416456F, 0.0F, 0.0F);
        this.Leg2B = new ModelRenderer(this, 0, 106);
        this.Leg2B.setRotationPoint(0.5F, 4.0F, 0.8F);
        this.Leg2B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg2B, -0.31869712141416456F, 0.0F, 0.0F);
        this.Leg7B = new ModelRenderer(this, 0, 106);
        this.Leg7B.setRotationPoint(0.5F, 4.0F, 0.2F);
        this.Leg7B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg7B, 0.31869712141416456F, 0.0F, 0.0F);
        this.HeadA = new ModelRenderer(this, 0, 0);
        this.HeadA.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.HeadA.addBox(0.0F, 0.0F, 0.0F, 12, 12, 12, 0.0F);
        this.HeadD = new ModelRenderer(this, 0, 75);
        this.HeadD.setRotationPoint(-0.5F, 2.0F, 1.0F);
        this.HeadD.addBox(0.0F, -1.0F, 0.0F, 13, 10, 10, 0.0F);
        this.Leg1A = new ModelRenderer(this, 0, 97);
        this.Leg1A.setRotationPoint(0.0F, 12.0F, 2.0F);
        this.Leg1A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg1A, -0.45971972497530644F, 0.8651597102135892F, 0.0F);
        this.Leg2C = new ModelRenderer(this, 0, 116);
        this.Leg2C.setRotationPoint(0.5F, 6.0F, 1.0F);
        this.Leg2C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg2C, -0.5462880558742251F, 0.0F, 0.0F);
        this.HeadB = new ModelRenderer(this, 0, 25);
        this.HeadB.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.HeadB.addBox(0.0F, -1.0F, 0.0F, 10, 14, 10, 0.0F);
        this.Leg7A = new ModelRenderer(this, 0, 97);
        this.Leg7A.setRotationPoint(2.0F, 13.0F, 8.0F);
        this.Leg7A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg7A, 0.45971972497530644F, -0.7740535232594852F, 0.0F);
        this.Leg1C = new ModelRenderer(this, 0, 116);
        this.Leg1C.setRotationPoint(0.5F, 6.0F, 1.0F);
        this.Leg1C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg1C, -0.5462880558742251F, 0.0F, 0.0F);
        this.Leg7C = new ModelRenderer(this, 0, 116);
        this.Leg7C.setRotationPoint(0.5F, 7.0F, 0.5F);
        this.Leg7C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg7C, 0.5462880558742251F, 0.0F, 0.0F);
        this.HeadC = new ModelRenderer(this, 0, 50);
        this.HeadC.setRotationPoint(3.0F, -2.0F, 3.0F);
        this.HeadC.addBox(0.0F, -1.0F, 0.0F, 6, 18, 6, 0.0F);
        this.Leg8C = new ModelRenderer(this, 0, 116);
        this.Leg8C.setRotationPoint(0.5F, 6.0F, 1.0F);
        this.Leg8C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg8C, -0.5462880558742251F, 0.0F, 0.0F);
        this.Leg5C = new ModelRenderer(this, 0, 116);
        this.Leg5C.setRotationPoint(0.5F, 7.0F, 0.5F);
        this.Leg5C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg5C, 0.5462880558742251F, 0.0F, 0.0F);
        this.Leg5B = new ModelRenderer(this, 0, 106);
        this.Leg5B.setRotationPoint(0.5F, 4.0F, 0.2F);
        this.Leg5B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg5B, 0.31869712141416456F, 0.0F, 0.0F);
        this.Leg4C = new ModelRenderer(this, 0, 116);
        this.Leg4C.setRotationPoint(0.5F, 7.0F, 0.5F);
        this.Leg4C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg4C, 0.5462880558742251F, 0.0F, 0.0F);
        this.Leg5A = new ModelRenderer(this, 0, 97);
        this.Leg5A.setRotationPoint(8.0F, 13.0F, 10.0F);
        this.Leg5A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg5A, 0.45971972497530644F, 0.7285004297824331F, 0.0F);
        this.Leg6C = new ModelRenderer(this, 0, 116);
        this.Leg6C.setRotationPoint(0.5F, 7.0F, 0.5F);
        this.Leg6C.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotateAngle(this.Leg6C, 0.5462880558742251F, 0.0F, 0.0F);
        this.Leg6B = new ModelRenderer(this, 0, 106);
        this.Leg6B.setRotationPoint(0.5F, 4.0F, 0.2F);
        this.Leg6B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg6B, 0.31869712141416456F, 0.0F, 0.0F);
        this.LWheel = new ModelRenderer(this, 0, 0);
        this.LWheel.setRotationPoint(4.5F, 23.0F, 6.0F);
        this.LWheel.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.Leg1B = new ModelRenderer(this, 0, 106);
        this.Leg1B.setRotationPoint(0.5F, 4.0F, 0.8F);
        this.Leg1B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg1B, -0.31869712141416456F, 0.0F, 0.0F);
        this.RWheel = new ModelRenderer(this, 0, 0);
        this.RWheel.setRotationPoint(6.5F, 23.0F, 6.0F);
        this.RWheel.addBox(0.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.Leg3A = new ModelRenderer(this, 0, 97);
        this.Leg3A.setRotationPoint(9.0F, 13.0F, 4.0F);
        this.Leg3A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg3A, 0.45971972497530644F, 2.0032889154390916F, 0.0F);
        this.Leg8B = new ModelRenderer(this, 0, 106);
        this.Leg8B.setRotationPoint(0.5F, 4.0F, 0.8F);
        this.Leg8B.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(this.Leg8B, -0.31869712141416456F, 0.0F, 0.0F);
        this.Leg2A = new ModelRenderer(this, 0, 97);
        this.Leg2A.setRotationPoint(4.5F, 12.0F, 0.0F);
        this.Leg2A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg2A, -0.45971972497530644F, -0.136659280431156F, 0.0F);
        this.Leg4A = new ModelRenderer(this, 0, 97);
        this.Leg4A.setRotationPoint(10.0F, 13.0F, 8.0F);
        this.Leg4A.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.Leg4A, 0.45971972497530644F, 1.5481070465189704F, 0.0F);
        this.HeadA.addChild(this.Leg8A);
        this.Leg4A.addChild(this.Leg4B);
        this.Leg3B.addChild(this.Leg3C);
        this.HeadA.addChild(this.WheelStrut);
        this.HeadA.addChild(this.Leg6A);
        this.Leg3A.addChild(this.Leg3B);
        this.Leg2A.addChild(this.Leg2B);
        this.Leg7A.addChild(this.Leg7B);
        this.HeadA.addChild(this.HeadD);
        this.HeadA.addChild(this.Leg1A);
        this.Leg2B.addChild(this.Leg2C);
        this.HeadA.addChild(this.HeadB);
        this.HeadA.addChild(this.Leg7A);
        this.Leg1B.addChild(this.Leg1C);
        this.Leg7B.addChild(this.Leg7C);
        this.HeadA.addChild(this.HeadC);
        this.Leg8B.addChild(this.Leg8C);
        this.Leg5B.addChild(this.Leg5C);
        this.Leg5A.addChild(this.Leg5B);
        this.Leg4B.addChild(this.Leg4C);
        this.HeadA.addChild(this.Leg5A);
        this.Leg6B.addChild(this.Leg6C);
        this.Leg6A.addChild(this.Leg6B);
        this.HeadA.addChild(this.LWheel);
        this.Leg1A.addChild(this.Leg1B);
        this.HeadA.addChild(this.RWheel);
        this.HeadA.addChild(this.Leg3A);
        this.Leg8A.addChild(this.Leg8B);
        this.HeadA.addChild(this.Leg2A);
        this.HeadA.addChild(this.Leg4A);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.HeadA.render(f5);
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
        this.LWheel.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RWheel.rotateAngleX = MathHelper.cos(limbSwing * 0.8662F) * 1.4F * limbSwingAmount;
    }

}
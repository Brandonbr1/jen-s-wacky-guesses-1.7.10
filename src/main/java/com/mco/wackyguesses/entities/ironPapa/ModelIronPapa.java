package com.mco.wackyguesses.entities.ironPapa;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

/**
 * ModelIronPapa - TheMCO
 * Created using Tabula 4.1.1
 */
public class ModelIronPapa extends ModelBase {
    public ModelRenderer field_78176_b0;
    public ModelRenderer field_78176_b1;
    public ModelRenderer ironGolemRightArm;
    public ModelRenderer ironGolemLeftArm;
    public ModelRenderer ironGolemLeftLeg;
    public ModelRenderer Head;
    public ModelRenderer ironGolemNose;
    public ModelRenderer ironGolemRightLeg;
    public ModelRenderer HatA;
    public ModelRenderer HatB;
    public ModelRenderer HatC;
    public ModelRenderer HatD;
    public ModelRenderer HatE;
    public ModelRenderer HatF;

    public ModelIronPapa() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.HatA = new ModelRenderer(this, -8, 19);
        this.HatA.setRotationPoint(-0.5F, -12.3F, 3.0F);
        this.HatA.addBox(-4.0F, 0.0F, -9.0F, 9, 0, 9, 0.0F);
        this.HatF = new ModelRenderer(this, 13, 28);
        this.HatF.setRotationPoint(-0.5F, -6.3F, -4.0F);
        this.HatF.addBox(-4.0F, 0.0F, -9.0F, 9, 0, 7, 0.0F);
        this.ironGolemNose = new ModelRenderer(this, 24, 0);
        this.ironGolemNose.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.ironGolemNose.addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.Head.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
        this.HatC = new ModelRenderer(this, 1, 20);
        this.HatC.setRotationPoint(8.5F, -12.3F, 3.0F);
        this.HatC.addBox(-4.0F, 0.0F, -9.0F, 0, 6, 9, 0.0F);
        this.field_78176_b0 = new ModelRenderer(this, 0, 40);
        this.field_78176_b0.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.field_78176_b0.addBox(-9.0F, -2.0F, -6.0F, 18, 24, 11, 0.0F);
        this.ironGolemLeftArm = new ModelRenderer(this, 60, 21);
        this.ironGolemLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemLeftArm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.ironGolemRightLeg = new ModelRenderer(this, 60, 0);
        this.ironGolemRightLeg.mirror = true;
        this.ironGolemRightLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.ironGolemRightLeg.addBox(-3.5F, 4.0F, -3.0F, 6, 9, 5, 0.0F);
        this.HatE = new ModelRenderer(this, 20, 21);
        this.HatE.setRotationPoint(-0.5F, -12.3F, 3.0F);
        this.HatE.addBox(-4.0F, 0.0F, -9.0F, 9, 6, 0, 0.0F);
        this.ironGolemLeftLeg = new ModelRenderer(this, 37, 0);
        this.ironGolemLeftLeg.setRotationPoint(-4.0F, 12.0F, 0.0F);
        this.ironGolemLeftLeg.addBox(-3.5F, 3.0F, -3.0F, 6, 9, 5, 0.0F);
        this.HatD = new ModelRenderer(this, 20, 21);
        this.HatD.setRotationPoint(-0.5F, -12.3F, 12.0F);
        this.HatD.addBox(-4.0F, 0.0F, -9.0F, 9, 6, 0, 0.0F);
        this.HatB = new ModelRenderer(this, 1, 20);
        this.HatB.setRotationPoint(-0.5F, -12.3F, 3.0F);
        this.HatB.addBox(-4.0F, 0.0F, -9.0F, 0, 6, 9, 0.0F);
        this.ironGolemRightArm = new ModelRenderer(this, 60, 58);
        this.ironGolemRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemRightArm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.field_78176_b1 = new ModelRenderer(this, 0, 61);
        this.field_78176_b1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.field_78176_b1.addBox(-5.5F, 8.0F, -8.0F, 13, 11, 2, 0.5F);
        this.Head.addChild(this.HatA);
        this.Head.addChild(this.HatF);
        this.Head.addChild(this.HatC);
        this.Head.addChild(this.HatE);
        this.Head.addChild(this.HatD);
        this.Head.addChild(this.HatB);
        this.Head.addChild(this.ironGolemNose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Head.render(f5);
        this.field_78176_b0.render(f5);
        this.ironGolemLeftArm.render(f5);
        this.ironGolemRightLeg.render(f5);
        this.ironGolemLeftLeg.render(f5);
        this.ironGolemRightArm.render(f5);
        this.field_78176_b1.render(f5);
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
        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Head.rotateAngleX = headPitch * 0.017453292F;
        this.ironGolemLeftLeg.rotateAngleX = -1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.ironGolemRightLeg.rotateAngleX = 1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.ironGolemLeftLeg.rotateAngleY = 0.0F;
        this.ironGolemRightLeg.rotateAngleY = 0.0F;
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
    {
        EntityIronPapa entityironpapa = (EntityIronPapa)entitylivingbaseIn;
        int i = entityironpapa.getAttackTimer();

        if (i > 0)
        {
            this.ironGolemRightArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave(i - partialTickTime, 10.0F);
            this.ironGolemLeftArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave(i - partialTickTime, 10.0F);
        }

        else
        {
            this.ironGolemRightArm.rotateAngleX = (-0.2F + 1.5F * this.triangleWave(p_78086_2_, 13.0F)) * p_78086_3_;
            this.ironGolemLeftArm.rotateAngleX = (-0.2F - 1.5F * this.triangleWave(p_78086_2_, 13.0F)) * p_78086_3_;
        }
    }

    private float triangleWave(float p_78172_1_, float p_78172_2_)
    {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }

}
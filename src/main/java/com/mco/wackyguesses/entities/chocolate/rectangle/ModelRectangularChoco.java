package com.mco.wackyguesses.entities.chocolate.rectangle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * RectangularChoco - Undefined
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelRectangularChoco extends ModelBase {
    public ModelRenderer RecA;
    public ModelRenderer RecB;
    public ModelRenderer RecC;
    public ModelRenderer RLeg;
    public ModelRenderer LLeg;
    public ModelRenderer LArm;
    public ModelRenderer RArm;

    public ModelRectangularChoco() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.LArm = new ModelRenderer(this, 0, 0);
        this.LArm.setRotationPoint(-2.0F, 9.5F, 3.5F);
        this.LArm.addBox(-1.5F, -1.5F, -12.0F, 3, 3, 12, 0.0F);
        this.RecA = new ModelRenderer(this, 0, 0);
        this.RecA.setRotationPoint(-7.5F, -8.0F, -2.0F);
        this.RecA.addBox(0.0F, 0.0F, -2.0F, 15, 20, 6, 0.0F);
        this.RecB = new ModelRenderer(this, 0, 0);
        this.RecB.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.RecB.addBox(0.0F, 0.0F, -2.0F, 16, 19, 5, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 0);
        this.LLeg.setRotationPoint(2.5F, 20.0F, -0.5F);
        this.LLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 12, 3, 0.0F);
        this.RArm = new ModelRenderer(this, 0, 0);
        this.RArm.setRotationPoint(17.0F, 9.5F, 3.5F);
        this.RArm.addBox(-1.5F, -1.5F, -12.0F, 3, 3, 12, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 0);
        this.RLeg.setRotationPoint(12.0F, 20.0F, -0.5F);
        this.RLeg.addBox(-1.5F, 0.0F, 0.0F, 3, 12, 3, 0.0F);
        this.RecC = new ModelRenderer(this, 0, 0);
        this.RecC.setRotationPoint(0.5F, -0.5F, 1.0F);
        this.RecC.addBox(0.0F, 0.0F, -2.0F, 14, 21, 4, 0.0F);
        this.RecA.addChild(this.LArm);
        this.RecA.addChild(this.RecB);
        this.RecA.addChild(this.LLeg);
        this.RecA.addChild(this.RArm);
        this.RecA.addChild(this.RLeg);
        this.RecA.addChild(this.RecC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f1, f2, f3, f4, f5, f, entity);
        this.RecA.render(f5);
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
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RArm.rotateAngleX = MathHelper.cos(limbSwing * 0.8662F) * 1.4F * limbSwingAmount;
        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LArm.rotateAngleX = MathHelper.cos(limbSwing * -0.8662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

}
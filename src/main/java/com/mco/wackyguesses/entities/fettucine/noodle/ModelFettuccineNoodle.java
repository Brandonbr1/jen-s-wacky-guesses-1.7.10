package com.mco.wackyguesses.entities.fettucine.noodle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelFettuccineNoodle extends ModelBase {
    private float movementScale = 1.0F;
    public ModelRenderer Noodle1;
    public ModelRenderer Noodle2;
    public ModelRenderer Noodle3;
    public ModelRenderer Noodle4;
    public ModelRenderer Noodle5;
    public ModelRenderer Noodle6;
    public ModelRenderer Noodle7;
    public ModelRenderer Noodle8;

    public ModelFettuccineNoodle() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Noodle6 = new ModelRenderer(this, 0, 0);
        this.Noodle6.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle6.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle7 = new ModelRenderer(this, 0, 0);
        this.Noodle7.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle7.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle1 = new ModelRenderer(this, 0, 0);
        this.Noodle1.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.Noodle1.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle2 = new ModelRenderer(this, 0, 0);
        this.Noodle2.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle2.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle3 = new ModelRenderer(this, 0, 0);
        this.Noodle3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle3.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle5 = new ModelRenderer(this, 0, 0);
        this.Noodle5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle5.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle4 = new ModelRenderer(this, 0, 0);
        this.Noodle4.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle4.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle8 = new ModelRenderer(this, 0, 0);
        this.Noodle8.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Noodle8.addBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F);
        this.Noodle5.addChild(this.Noodle6);
        this.Noodle6.addChild(this.Noodle7);
        this.Noodle1.addChild(this.Noodle2);
        this.Noodle2.addChild(this.Noodle3);
        this.Noodle4.addChild(this.Noodle5);
        this.Noodle3.addChild(this.Noodle4);
        this.Noodle7.addChild(this.Noodle8);
    }

    private void doNothing() {
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.Noodle1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        this.Noodle2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle5.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle6.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle7.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
        this.Noodle8.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
    }
}
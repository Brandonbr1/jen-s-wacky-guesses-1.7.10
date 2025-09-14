package com.mco.wackyguesses.entities.explodaCow;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelExplodaCow extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer REar;
    public ModelRenderer LEar;
    public ModelRenderer Udder;
    public ModelRenderer RLegFront;
    public ModelRenderer LLegFront;
    public ModelRenderer RLegBack;
    public ModelRenderer LLegBack;

    public ModelExplodaCow() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.LLegFront = new ModelRenderer(this, 0, 16);
        this.LLegFront.setRotationPoint(-2.0F, 12.0F, -4.0F);
        this.LLegFront.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.REar = new ModelRenderer(this, 22, 0);
        this.REar.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.REar.addBox(4.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.LEar = new ModelRenderer(this, 22, 0);
        this.LEar.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.LEar.addBox(-5.0F, -5.0F, -4.0F, 1, 3, 1, 0.0F);
        this.Body = new ModelRenderer(this, 18, 4);
        this.Body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(this.Body, 1.5707964F, 0.0F, 0.0F);
        this.RLegBack = new ModelRenderer(this, 0, 16);
        this.RLegBack.setRotationPoint(2.0F, 12.0F, 4.0F);
        this.RLegBack.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.Head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6, 0.0F);
        this.LLegBack = new ModelRenderer(this, 0, 16);
        this.LLegBack.setRotationPoint(-2.0F, 12.0F, 4.0F);
        this.LLegBack.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Udder = new ModelRenderer(this, 52, 0);
        this.Udder.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Udder.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(this.Udder, 1.5707964F, 0.0F, 0.0F);
        this.RLegFront = new ModelRenderer(this, 0, 16);
        this.RLegFront.setRotationPoint(2.0F, 12.0F, -4.0F);
        this.RLegFront.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.LLegFront.render(f5);
        this.REar.render(f5);
        this.LEar.render(f5);
        this.Body.render(f5);
        this.RLegBack.render(f5);
        this.Head.render(f5);
        this.LLegBack.render(f5);
        this.Udder.render(f5);
        this.RLegFront.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.Head.rotateAngleX = headPitch * 0.017453292F;
        this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.Body.rotateAngleX = 1.5707964F;
        this.LLegFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RLegFront.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.LLegBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
        this.RLegBack.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
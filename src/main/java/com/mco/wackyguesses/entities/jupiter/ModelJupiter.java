package com.mco.wackyguesses.entities.jupiter;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelJupiter extends ModelBase {
    public ModelRenderer MainBody;
    public ModelRenderer MainBodyA;
    public ModelRenderer MainBodyB;
    public ModelRenderer MainBodyC;
    public ModelRenderer MainBodyD;
    public ModelRenderer MainBodyE;
    public ModelRenderer MainBodyF;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer Shades;
    public ModelRenderer Mouth;

    public ModelJupiter() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.MainBodyB = new ModelRenderer(this, 0, 84);
        this.MainBodyB.setRotationPoint(-1.0F, 1.0F, 2.0F);
        this.MainBodyB.addBox(0.0F, 0.0F, 0.0F, 22, 18, 18, 0.0F);
        this.LLeg = new ModelRenderer(this, 0, 10);
        this.LLeg.setRotationPoint(3.0F, 21.0F, 9.5F);
        this.LLeg.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.MainBodyA = new ModelRenderer(this, 0, 42);
        this.MainBodyA.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.MainBodyA.addBox(0.0F, 0.0F, 0.0F, 18, 22, 18, 0.0F);
        this.RLeg = new ModelRenderer(this, 0, 10);
        this.RLeg.setRotationPoint(16.0F, 21.0F, 9.5F);
        this.RLeg.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
        this.MainBodyE = new ModelRenderer(this, 0, 203);
        this.MainBodyE.setRotationPoint(-2.0F, 4.0F, 5.0F);
        this.MainBodyE.addBox(0.0F, 0.0F, 0.0F, 24, 12, 12, 0.0F);
        this.Mouth = new ModelRenderer(this, 98, 50);
        this.Mouth.setRotationPoint(3.0F, 11.0F, -3.0F);
        this.Mouth.addBox(0.0F, 0.0F, 0.0F, 14, 8, 0, 0.0F);
        this.MainBody = new ModelRenderer(this, 0, 0);
        this.MainBody.setRotationPoint(-10.0F, -5.0F, -10.0F);
        this.MainBody.addBox(0.0F, 0.0F, 0.0F, 20, 20, 20, 0.0F);
        this.Shades = new ModelRenderer(this, 60, 50);
        this.Shades.setRotationPoint(1.0F, 2.0F, -3.0F);
        this.Shades.addBox(0.0F, 0.0F, 0.0F, 18, 8, 0, 0.0F);
        this.MainBodyD = new ModelRenderer(this, 0, 164);
        this.MainBodyD.setRotationPoint(4.0F, -2.0F, 4.0F);
        this.MainBodyD.addBox(0.0F, 0.0F, 0.0F, 12, 24, 12, 0.0F);
        this.MainBodyF = new ModelRenderer(this, 82, 0);
        this.MainBodyF.setRotationPoint(4.0F, 4.0F, -2.0F);
        this.MainBodyF.addBox(0.0F, 0.0F, 0.0F, 12, 12, 24, 0.0F);
        this.MainBodyC = new ModelRenderer(this, 0, 122);
        this.MainBodyC.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.MainBodyC.addBox(0.0F, 0.0F, 0.0F, 18, 18, 22, 0.0F);
        this.MainBody.addChild(this.MainBodyB);
        this.MainBody.addChild(this.LLeg);
        this.MainBody.addChild(this.MainBodyA);
        this.MainBody.addChild(this.RLeg);
        this.MainBody.addChild(this.MainBodyE);
        this.MainBody.addChild(this.Mouth);
        this.MainBody.addChild(this.Shades);
        this.MainBody.addChild(this.MainBodyD);
        this.MainBody.addChild(this.MainBodyF);
        this.MainBody.addChild(this.MainBodyC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.MainBody.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.LLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.RLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 1.4F * limbSwingAmount;
    }
}
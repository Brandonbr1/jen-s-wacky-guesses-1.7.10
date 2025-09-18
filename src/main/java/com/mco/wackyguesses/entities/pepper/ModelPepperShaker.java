package com.mco.wackyguesses.entities.pepper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelPepperShaker extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer Side5;
    public ModelRenderer Side6;
    public ModelRenderer Side7;
    public ModelRenderer Side8;
    public ModelRenderer TopA;
    public ModelRenderer TopB;
    public ModelRenderer TopC;
    public ModelRenderer TopD;
    public ModelRenderer Segment1A;
    public ModelRenderer Segment3A;
    public ModelRenderer Segment4A;
    public ModelRenderer Segment2A;
    public ModelRenderer Bottom;

    public ModelPepperShaker() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.Base = new ModelRenderer(this, 0, 125);
        this.Base.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.Base.addBox(-7.0F, -30.0F, -7.0F, 14, 30, 14, 0.0F);
        this.Side6 = new ModelRenderer(this, 20, 50);
        this.Side6.setRotationPoint(-9.0F, -10.0F, 0.0F);
        this.Side6.addBox(0.0F, -20.0F, -7.0F, 2, 30, 14, 0.0F);
        this.Segment1A = new ModelRenderer(this, 0, 0);
        this.Segment1A.setRotationPoint(-10.0F, -6.0F, -10.0F);
        this.Segment1A.addBox(0.0F, 0.0F, 0.0F, 20, 4, 20, 0.0F);
        this.TopD = new ModelRenderer(this, 0, 106);
        this.TopD.setRotationPoint(0.0F, -33.0F, 0.0F);
        this.TopD.addBox(-10.0F, -1.0F, -7.0F, 20, 2, 14, 0.0F);
        this.TopA = new ModelRenderer(this, 0, 27);
        this.TopA.setRotationPoint(0.0F, -31.0F, 0.0F);
        this.TopA.addBox(-7.0F, -5.0F, -7.0F, 14, 6, 14, 0.0F);
        this.Bottom = new ModelRenderer(this, 11, 9);
        this.Bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Bottom.addBox(-7.0F, 0.0F, -7.0F, 14, 1, 14, 0.0F);
        this.TopC = new ModelRenderer(this, 0, 100);
        this.TopC.setRotationPoint(0.0F, -33.0F, 0.0F);
        this.TopC.addBox(-7.0F, -1.0F, -10.0F, 14, 2, 20, 0.0F);
        this.Segment4A = new ModelRenderer(this, 0, 0);
        this.Segment4A.setRotationPoint(-10.0F, -28.0F, -10.0F);
        this.Segment4A.addBox(0.0F, 0.0F, 0.0F, 20, 4, 20, 0.0F);
        this.Side8 = new ModelRenderer(this, 60, 62);
        this.Side8.setRotationPoint(0.0F, -10.0F, 7.0F);
        this.Side8.addBox(-7.0F, -20.0F, 0.0F, 14, 30, 2, 0.0F);
        this.Segment2A = new ModelRenderer(this, 0, 0);
        this.Segment2A.setRotationPoint(-10.0F, -13.0F, -10.0F);
        this.Segment2A.addBox(0.0F, 0.0F, 0.0F, 20, 4, 20, 0.0F);
        this.Side7 = new ModelRenderer(this, 60, 62);
        this.Side7.setRotationPoint(0.0F, -10.0F, -9.0F);
        this.Side7.addBox(-7.0F, -20.0F, 0.0F, 14, 30, 2, 0.0F);
        this.TopB = new ModelRenderer(this, 0, 100);
        this.TopB.setRotationPoint(0.0F, -32.0F, 0.0F);
        this.TopB.addBox(-9.0F, -3.0F, -9.0F, 18, 4, 18, 0.0F);
        this.Side5 = new ModelRenderer(this, 20, 50);
        this.Side5.setRotationPoint(7.0F, -10.0F, 0.0F);
        this.Side5.addBox(0.0F, -20.0F, -7.0F, 2, 30, 14, 0.0F);
        this.Segment3A = new ModelRenderer(this, 0, 0);
        this.Segment3A.setRotationPoint(-10.0F, -21.0F, -10.0F);
        this.Segment3A.addBox(0.0F, 0.0F, 0.0F, 20, 4, 20, 0.0F);
        this.Base.addChild(this.Side6);
        this.Base.addChild(this.Segment1A);
        this.Base.addChild(this.TopD);
        this.Base.addChild(this.TopA);
        this.Base.addChild(this.Bottom);
        this.Base.addChild(this.TopC);
        this.Base.addChild(this.Segment4A);
        this.Base.addChild(this.Side8);
        this.Base.addChild(this.Segment2A);
        this.Base.addChild(this.Side7);
        this.Base.addChild(this.TopB);
        this.Base.addChild(this.Side5);
        this.Base.addChild(this.Segment3A);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
package com.mco.wackyguesses.entities.wheelbarrow;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelWheelbarrow extends ModelBase {
    public ModelRenderer Base;
    public ModelRenderer Front;
    public ModelRenderer Back;
    public ModelRenderer Left;
    public ModelRenderer Right;
    public ModelRenderer LHandle;
    public ModelRenderer RHandle;
    public ModelRenderer LStrut;
    public ModelRenderer RStrut;
    public ModelRenderer StrutConnector;
    public ModelRenderer RStrutDiagonal;
    public ModelRenderer LStrutDiagonal;
    public ModelRenderer LWheelStrut;
    public ModelRenderer RWheelStrut;
    public ModelRenderer Axle;
    public ModelRenderer Dirt;
    public ModelRenderer Spike1;
    public ModelRenderer Spike2;
    public ModelRenderer Spike3;
    public ModelRenderer Spike3_1;
    public ModelRenderer SpikeConnector1;
    public ModelRenderer SpikeConnector2;
    public ModelRenderer SpikeConnector3;
    public ModelRenderer SpikeConnector4;
    public ModelRenderer SpikeConnector5;
    public ModelRenderer SpikeConnector6;
    public ModelRenderer SpikeConnector7;
    public ModelRenderer SpikeConnector8;

    public ModelWheelbarrow() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.SpikeConnector7 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector7.setRotationPoint(2.5F, 4.2F, 2.9F);
        this.SpikeConnector7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector7, 1.0883874F, 0.0F, 0.0F);
        this.SpikeConnector4 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector4.setRotationPoint(2.5F, 4.9F, -4.4F);
        this.SpikeConnector4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector4, 1.953896F, 0.0F, 0.0F);
        this.Front = new ModelRenderer(this, 60, 0);
        this.Front.setRotationPoint(6.0F, -1.0F, -19.0F);
        this.Front.addBox(-6.0F, -9.0F, 0.0F, 12, 10, 1, 0.0F);
        this.setRotateAngle(this.Front, 0.08726646F, 0.0F, 0.0F);
        this.Base = new ModelRenderer(this, 0, 0);
        this.Base.setRotationPoint(-8.0F, 14.0F, -1.0F);
        this.Base.addBox(0.0F, 0.0F, -19.0F, 12, 1, 30, 0.0F);
        this.setRotateAngle(this.Base, 0.091106184F, 0.0F, 0.0F);
        this.SpikeConnector2 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector2.setRotationPoint(2.5F, -3.7F, -4.9F);
        this.SpikeConnector2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector2, 0.5009095F, 0.0F, 0.0F);
        this.Spike3 = new ModelRenderer(this, 0, 51);
        this.Spike3.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spike3.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(this.Spike3, -1.5707964F, 0.009075712F, 0.0F);
        this.RHandle = new ModelRenderer(this, 60, 15);
        this.RHandle.setRotationPoint(2.0F, 0.0F, 11.0F);
        this.RHandle.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 10, 0.0F);
        this.Spike1 = new ModelRenderer(this, 0, 51);
        this.Spike1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spike1.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 12, 0.0F);
        this.Spike3_1 = new ModelRenderer(this, 0, 51);
        this.Spike3_1.setRotationPoint(3.0F, 0.2F, 0.2F);
        this.Spike3_1.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(this.Spike3_1, -2.3561945F, 0.0F, 0.0F);
        this.LStrut = new ModelRenderer(this, 78, 13);
        this.LStrut.setRotationPoint(9.0F, 1.0F, 10.0F);
        this.LStrut.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.LWheelStrut = new ModelRenderer(this, 0, 35);
        this.LWheelStrut.setRotationPoint(1.0F, 1.0F, -19.0F);
        this.LWheelStrut.addBox(0.0F, 0.0F, -10.0F, 2, 1, 12, 0.0F);
        this.RStrutDiagonal = new ModelRenderer(this, 60, 15);
        this.RStrutDiagonal.setRotationPoint(1.0F, 1.0F, 7.0F);
        this.RStrutDiagonal.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(this.RStrutDiagonal, 0.6981317F, 0.0F, 0.0F);
        this.LStrutDiagonal = new ModelRenderer(this, 60, 15);
        this.LStrutDiagonal.setRotationPoint(9.0F, 1.0F, 7.0F);
        this.LStrutDiagonal.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(this.LStrutDiagonal, 0.6981317F, 0.0F, 0.0F);
        this.Dirt = new ModelRenderer(this, 0, 43);
        this.Dirt.setRotationPoint(11.0F, -8.0F, 11.0F);
        this.Dirt.addBox(-11.0F, 0.0F, -30.0F, 12, 1, 31, 0.0F);
        this.Axle = new ModelRenderer(this, 0, 55);
        this.Axle.setRotationPoint(3.0F, 1.5F, -27.0F);
        this.Axle.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        this.setRotateAngle(this.Axle, 0.7853982F, 0.0F, 0.0F);
        this.Spike2 = new ModelRenderer(this, 0, 51);
        this.Spike2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.Spike2.addBox(-0.5F, 0.0F, -6.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(this.Spike2, -0.7853982F, 0.0F, 0.0F);
        this.StrutConnector = new ModelRenderer(this, 0, 0);
        this.StrutConnector.setRotationPoint(7.0F, 3.0F, 10.0F);
        this.StrutConnector.addBox(-4.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
        this.RWheelStrut = new ModelRenderer(this, 0, 35);
        this.RWheelStrut.setRotationPoint(9.0F, 1.0F, -19.0F);
        this.RWheelStrut.addBox(0.0F, 0.0F, -10.0F, 2, 1, 12, 0.0F);
        this.SpikeConnector3 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector3.setRotationPoint(2.5F, 0.7F, -6.3F);
        this.SpikeConnector3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector3, 1.2442452F, 0.0F, 0.0F);
        this.Left = new ModelRenderer(this, 0, 77);
        this.Left.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.Left.addBox(0.0F, -9.0F, -20.0F, 1, 10, 31, 0.0F);
        this.setRotateAngle(this.Left, 0.0F, 0.0F, -0.08726646F);
        this.Right = new ModelRenderer(this, 0, 77);
        this.Right.setRotationPoint(11.0F, -1.0F, 1.0F);
        this.Right.addBox(0.0F, -9.0F, -20.0F, 1, 10, 31, 0.0F);
        this.setRotateAngle(this.Right, 0.0F, 0.0F, 0.08726646F);
        this.RStrut = new ModelRenderer(this, 78, 13);
        this.RStrut.setRotationPoint(1.0F, 1.0F, 10.0F);
        this.RStrut.addBox(0.0F, 0.0F, 0.0F, 2, 10, 1, 0.0F);
        this.SpikeConnector1 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector1.setRotationPoint(2.5F, -6.1F, -0.7F);
        this.SpikeConnector1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector1, -0.31869712F, 0.0F, 0.0F);
        this.SpikeConnector8 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector8.setRotationPoint(2.5F, 0.6F, 5.0F);
        this.SpikeConnector8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector8, 1.953896F, 0.0F, 0.0F);
        this.Back = new ModelRenderer(this, 60, 0);
        this.Back.setRotationPoint(6.0F, -1.0F, 11.0F);
        this.Back.addBox(-6.0F, -9.0F, 0.0F, 12, 10, 1, 0.0F);
        this.setRotateAngle(this.Back, -0.08726646F, 0.0F, 0.0F);
        this.LHandle = new ModelRenderer(this, 60, 15);
        this.LHandle.setRotationPoint(10.0F, 0.0F, 11.0F);
        this.LHandle.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 10, 0.0F);
        this.SpikeConnector6 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector6.setRotationPoint(2.5F, 5.3F, -0.9F);
        this.SpikeConnector6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector6, 0.35185838F, 0.0F, 0.0F);
        this.SpikeConnector5 = new ModelRenderer(this, 0, 51);
        this.SpikeConnector5.setRotationPoint(2.5F, 3.6F, -4.4F);
        this.SpikeConnector5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(this.SpikeConnector5, -0.31869712F, 0.0F, 0.0F);
        this.Axle.addChild(this.SpikeConnector7);
        this.Axle.addChild(this.SpikeConnector4);
        this.Base.addChild(this.Front);
        this.Axle.addChild(this.SpikeConnector2);
        this.Axle.addChild(this.Spike3);
        this.Base.addChild(this.RHandle);
        this.Axle.addChild(this.Spike1);
        this.Axle.addChild(this.Spike3_1);
        this.Base.addChild(this.LStrut);
        this.Base.addChild(this.LWheelStrut);
        this.Base.addChild(this.RStrutDiagonal);
        this.Base.addChild(this.LStrutDiagonal);
        this.Base.addChild(this.Dirt);
        this.Base.addChild(this.Axle);
        this.Axle.addChild(this.Spike2);
        this.Base.addChild(this.StrutConnector);
        this.Base.addChild(this.RWheelStrut);
        this.Axle.addChild(this.SpikeConnector3);
        this.Base.addChild(this.Left);
        this.Base.addChild(this.Right);
        this.Base.addChild(this.RStrut);
        this.Axle.addChild(this.SpikeConnector1);
        this.Axle.addChild(this.SpikeConnector8);
        this.Base.addChild(this.Back);
        this.Base.addChild(this.LHandle);
        this.Axle.addChild(this.SpikeConnector6);
        this.Axle.addChild(this.SpikeConnector5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.Base.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.Axle.rotateAngleX = Math.abs(MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
    }
}
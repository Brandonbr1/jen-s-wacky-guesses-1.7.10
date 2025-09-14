/* Decompiler 43ms, total 395ms, lines 116 */
package com.mco.wackyguesses.entities.zombieJar;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelZombieJar extends ModelBase {
    public ModelRenderer Bottom;
    public ModelRenderer Left;
    public ModelRenderer Right;
    public ModelRenderer Back;
    public ModelRenderer Right_1;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer Arm;
    public ModelRenderer Leg;
    public ModelRenderer Arm1;
    public ModelRenderer Head1;
    public ModelRenderer Body1;
    public ModelRenderer Leg1;
    public ModelRenderer Arm2;
    public ModelRenderer Body2;
    public ModelRenderer Head2;

    public ModelZombieJar() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Bottom = new ModelRenderer(this, 0, 98);
        this.Bottom.setRotationPoint(-13.0F, 20.0F, 11.0F);
        this.Bottom.addBox(0.0F, 0.0F, -24.0F, 26, 4, 26, 0.0F);
        this.Leg = new ModelRenderer(this, 0, 8);
        this.Leg.setRotationPoint(4.0F, -7.0F, -6.9F);
        this.Leg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(this.Leg, -0.27925268F, 0.0F, -1.134464F);
        this.Body1 = new ModelRenderer(this, 0, 82);
        this.Body1.setRotationPoint(13.0F, -8.0F, 0.0F);
        this.Body1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(this.Body1, -1.548107F, 0.22759093F, 0.63739425F);
        this.Back = new ModelRenderer(this, 0, 0);
        this.Back.setRotationPoint(25.0F, -1.0F, 3.0F);
        this.Back.addBox(-3.0F, -34.0F, -25.0F, 4, 35, 26, 0.0F);
        this.setRotateAngle(this.Back, 0.0F, 1.5707964F, 0.0F);
        this.Arm = new ModelRenderer(this, 40, 8);
        this.Arm.setRotationPoint(4.0F, -2.0F, -12.0F);
        this.Arm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(this.Arm, 1.5707964F, 0.13665928F, 0.0F);
        this.Leg1 = new ModelRenderer(this, 0, 8);
        this.Leg1.setRotationPoint(2.9F, -12.2F, -22.0F);
        this.Leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(this.Leg1, 0.091106184F, 0.4098033F, -0.045553092F);
        this.Head1 = new ModelRenderer(this, 0, 64);
        this.Head1.setRotationPoint(20.0F, -7.0F, -15.4F);
        this.Head1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(this.Head1, 1.6487975F, 0.19503303F, 1.4732324F);
        this.Arm1 = new ModelRenderer(this, 40, 8);
        this.Arm1.setRotationPoint(24.0F, -1.0F, -20.0F);
        this.Arm1.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(this.Arm1, 1.5707964F, -0.5009095F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 64);
        this.Head.setRotationPoint(22.0F, -8.0F, -2.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(this.Head, 0.0F, 0.0F, 3.1415927F);
        this.Right_1 = new ModelRenderer(this, 0, 0);
        this.Right_1.setRotationPoint(25.0F, -1.0F, -27.0F);
        this.Right_1.addBox(-3.0F, -34.0F, -25.0F, 4, 35, 26, 0.0F);
        this.setRotateAngle(this.Right_1, 0.0F, 1.5707964F, 0.0F);
        this.Body2 = new ModelRenderer(this, 0, 82);
        this.Body2.setRotationPoint(18.0F, -11.0F, -14.6F);
        this.Body2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(this.Body2, -1.548107F, -3.1415927F, 0.31869712F);
        this.Left = new ModelRenderer(this, 0, 0);
        this.Left.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.Left.addBox(-3.0F, -34.0F, -25.0F, 4, 35, 26, 0.0F);
        this.Arm2 = new ModelRenderer(this, 40, 8);
        this.Arm2.setRotationPoint(11.0F, -2.0F, -13.0F);
        this.Arm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(this.Arm2, 1.6390387F, -1.8668041F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 82);
        this.Body.setRotationPoint(11.0F, -12.0F, -22.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.setRotateAngle(this.Body, 0.27925268F, 0.0F, 0.0F);
        this.Head2 = new ModelRenderer(this, 0, 64);
        this.Head2.setRotationPoint(7.9F, -12.0F, -5.9F);
        this.Head2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(this.Head2, -0.4098033F, -0.31869712F, -0.5009095F);
        this.Right = new ModelRenderer(this, 0, 0);
        this.Right.setRotationPoint(29.0F, -1.0F, 1.0F);
        this.Right.addBox(-3.0F, -34.0F, -25.0F, 4, 35, 26, 0.0F);
        this.Bottom.addChild(this.Leg);
        this.Bottom.addChild(this.Body1);
        this.Bottom.addChild(this.Back);
        this.Bottom.addChild(this.Arm);
        this.Bottom.addChild(this.Leg1);
        this.Bottom.addChild(this.Head1);
        this.Bottom.addChild(this.Arm1);
        this.Bottom.addChild(this.Head);
        this.Bottom.addChild(this.Right_1);
        this.Bottom.addChild(this.Body2);
        this.Bottom.addChild(this.Left);
        this.Bottom.addChild(this.Arm2);
        this.Bottom.addChild(this.Body);
        this.Bottom.addChild(this.Head2);
        this.Bottom.addChild(this.Right);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bottom.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
package com.mco.wackyguesses.entities.floatBeeGunner;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelFloatBeeGunner - TheMCO
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelFloatBeeGunner extends ModelBase {
    public ModelRenderer BoatBase;
    public ModelRenderer BeeTorso;
    public ModelRenderer BoatLeftWall;
    public ModelRenderer BoatRightWall;
    public ModelRenderer BoatBackWall;
    public ModelRenderer BoatFrontWall;
    public ModelRenderer GunBase;
    public ModelRenderer SpinnyBit;
    public ModelRenderer BarrelA;
    public ModelRenderer BarrelB;
    public ModelRenderer BarrelC;
    public ModelRenderer BarrelD;
    public ModelRenderer BarrelE;
    public ModelRenderer BarrelF;
    public ModelRenderer BarrelG;
    public ModelRenderer BarrelH;
    public ModelRenderer BarrelI;
    public ModelRenderer SpinnyPt2;
    public ModelRenderer BeeHead;
    public ModelRenderer LWingStrutA;
    public ModelRenderer RWingStrutA;
    public ModelRenderer LAntenna1;
    public ModelRenderer RAntenna1;
    public ModelRenderer BeeConnector1;
    public ModelRenderer shape37;
    public ModelRenderer LAntenna2;
    public ModelRenderer RAntenna2;
    public ModelRenderer shape37_1;
    public ModelRenderer LWingStrutB;
    public ModelRenderer LWingA;
    public ModelRenderer LWingB;
    public ModelRenderer RWingStrutB;
    public ModelRenderer RWingA;
    public ModelRenderer RWingStrutB_1;

    public ModelFloatBeeGunner() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LWingStrutA = new ModelRenderer(this, 0, 95);
        this.LWingStrutA.setRotationPoint(2.0F, 1.0F, 3.5F);
        this.LWingStrutA.addBox(-7.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.LWingStrutA, 0.0F, 0.0F, 0.8196066167365371F);
        this.BarrelG = new ModelRenderer(this, 0, 30);
        this.BarrelG.setRotationPoint(1.5F, 2.0F, -1.0F);
        this.BarrelG.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.RWingStrutA = new ModelRenderer(this, 0, 95);
        this.RWingStrutA.setRotationPoint(9.0F, 2.0F, 4.0F);
        this.RWingStrutA.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.RWingStrutA, 0.0F, 0.0F, -0.8107054375513661F);
        this.BoatFrontWall = new ModelRenderer(this, 0, 18);
        this.BoatFrontWall.setRotationPoint(-2.0F, -6.0F, 0.0F);
        this.BoatFrontWall.addBox(0.0F, 0.0F, 0.0F, 20, 6, 2, 0.0F);
        this.BeeHead = new ModelRenderer(this, 0, 80);
        this.BeeHead.setRotationPoint(8.5F, -12.0F, 1.0F);
        this.BeeHead.addBox(-6.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F);
        this.BarrelA = new ModelRenderer(this, 0, 30);
        this.BarrelA.setRotationPoint(-2.5F, -2.0F, -1.0F);
        this.BarrelA.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.LWingB = new ModelRenderer(this, 25, 31);
        this.LWingB.setRotationPoint(0.1F, 0.3F, 0.5F);
        this.LWingB.addBox(-7.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.RWingStrutB_1 = new ModelRenderer(this, 25, 31);
        this.RWingStrutB_1.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.RWingStrutB_1.addBox(0.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.RAntenna2 = new ModelRenderer(this, 0, 0);
        this.RAntenna2.setRotationPoint(-0.1F, -3.8F, 1.4F);
        this.RAntenna2.addBox(0.0F, -8.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.RAntenna2, 0.36425021489121656F, -0.136659280431156F, 0.0F);
        this.BoatBackWall = new ModelRenderer(this, 0, 18);
        this.BoatBackWall.setRotationPoint(-2.0F, -6.0F, 22.0F);
        this.BoatBackWall.addBox(0.0F, 0.0F, 0.0F, 20, 6, 2, 0.0F);
        this.shape37 = new ModelRenderer(this, 0, 11);
        this.shape37.setRotationPoint(-4.0F, 3.0F, -2.0F);
        this.shape37.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.RAntenna1 = new ModelRenderer(this, 0, 0);
        this.RAntenna1.setRotationPoint(-1.0F, 3.0F, 1.0F);
        this.RAntenna1.addBox(0.0F, -8.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.RAntenna1, 0.136659280431156F, -0.136659280431156F, 0.0F);
        this.BarrelD = new ModelRenderer(this, 0, 30);
        this.BarrelD.setRotationPoint(-0.5F, -2.0F, -1.0F);
        this.BarrelD.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.BarrelF = new ModelRenderer(this, 0, 30);
        this.BarrelF.setRotationPoint(-0.5F, 2.0F, -1.0F);
        this.BarrelF.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.SpinnyPt2 = new ModelRenderer(this, 0, 50);
        this.SpinnyPt2.setRotationPoint(-3.5F, -3.0F, -13.0F);
        this.SpinnyPt2.addBox(0.0F, 0.0F, 0.0F, 7, 7, 1, 0.0F);
        this.LWingA = new ModelRenderer(this, 42, 31);
        this.LWingA.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.LWingA.addBox(-7.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.BoatBase = new ModelRenderer(this, 46, 0);
        this.BoatBase.setRotationPoint(-8.0F, 20.0F, -12.0F);
        this.BoatBase.addBox(0.0F, 0.0F, 0.0F, 16, 4, 24, 0.0F);
        this.BarrelE = new ModelRenderer(this, 0, 30);
        this.BarrelE.setRotationPoint(-0.5F, 0.0F, -1.0F);
        this.BarrelE.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.BeeConnector1 = new ModelRenderer(this, 0, 30);
        this.BeeConnector1.setRotationPoint(-4.0F, 7.0F, 2.2F);
        this.BeeConnector1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.BeeConnector1, -0.07958701389094143F, 0.0F, 0.0F);
        this.BarrelH = new ModelRenderer(this, 0, 30);
        this.BarrelH.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.BarrelH.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.LAntenna2 = new ModelRenderer(this, 0, 0);
        this.LAntenna2.setRotationPoint(0.7F, -3.8F, 1.6F);
        this.LAntenna2.addBox(0.0F, -8.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.LAntenna2, 0.36425021489121656F, 0.136659280431156F, -0.136659280431156F);
        this.SpinnyBit = new ModelRenderer(this, 0, 50);
        this.SpinnyBit.setRotationPoint(5.0F, 1.5F, -1.0F);
        this.SpinnyBit.addBox(-3.5F, -3.0F, 0.0F, 7, 7, 1, 0.0F);
        this.BoatLeftWall = new ModelRenderer(this, 0, 0);
        this.BoatLeftWall.setRotationPoint(-2.0F, -6.0F, 2.0F);
        this.BoatLeftWall.addBox(0.0F, 0.0F, 0.0F, 2, 6, 20, 0.0F);
        this.BarrelB = new ModelRenderer(this, 0, 30);
        this.BarrelB.setRotationPoint(-2.5F, 0.0F, -1.0F);
        this.BarrelB.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.LAntenna1 = new ModelRenderer(this, 0, 0);
        this.LAntenna1.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.LAntenna1.addBox(0.0F, -8.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.LAntenna1, 0.136659280431156F, 0.136659280431156F, 0.0F);
        this.BoatRightWall = new ModelRenderer(this, 0, 0);
        this.BoatRightWall.setRotationPoint(16.0F, -6.0F, 2.0F);
        this.BoatRightWall.addBox(0.0F, 0.0F, 0.0F, 2, 6, 20, 0.0F);
        this.BarrelI = new ModelRenderer(this, 0, 30);
        this.BarrelI.setRotationPoint(1.5F, -2.0F, -1.0F);
        this.BarrelI.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.shape37_1 = new ModelRenderer(this, 0, 8);
        this.shape37_1.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.shape37_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.RWingStrutB = new ModelRenderer(this, 0, 95);
        this.RWingStrutB.setRotationPoint(7.3F, -0.2F, 0.0F);
        this.RWingStrutB.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.RWingStrutB, 0.0F, 0.0F, 0.46059238960130355F);
        this.BeeTorso = new ModelRenderer(this, 0, 100);
        this.BeeTorso.setRotationPoint(-6.0F, 11.0F, -5.0F);
        this.BeeTorso.addBox(2.0F, 0.0F, 0.0F, 8, 10, 9, 0.0F);
        this.setRotateAngle(this.BeeTorso, -0.07958701389094143F, 0.0F, 0.0F);
        this.GunBase = new ModelRenderer(this, 0, 60);
        this.GunBase.setRotationPoint(3.0F, -9.0F, -3.0F);
        this.GunBase.addBox(0.0F, -3.0F, 0.0F, 10, 10, 6, 0.0F);
        this.RWingA = new ModelRenderer(this, 42, 31);
        this.RWingA.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.RWingA.addBox(0.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.LWingStrutB = new ModelRenderer(this, 0, 95);
        this.LWingStrutB.setRotationPoint(-7.3F, 0.3F, 0.0F);
        this.LWingStrutB.addBox(-7.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.LWingStrutB, 0.0F, 0.0F, -0.46059238960130355F);
        this.BarrelC = new ModelRenderer(this, 0, 30);
        this.BarrelC.setRotationPoint(-2.5F, 2.0F, -1.0F);
        this.BarrelC.addBox(0.0F, 0.0F, -14.0F, 1, 1, 15, 0.0F);
        this.BeeTorso.addChild(this.LWingStrutA);
        this.SpinnyBit.addChild(this.BarrelG);
        this.BeeTorso.addChild(this.RWingStrutA);
        this.BoatBase.addChild(this.BoatFrontWall);
        this.BeeTorso.addChild(this.BeeHead);
        this.SpinnyBit.addChild(this.BarrelA);
        this.LWingStrutB.addChild(this.LWingB);
        this.RWingStrutB.addChild(this.RWingStrutB_1);
        this.RAntenna1.addChild(this.RAntenna2);
        this.BoatBase.addChild(this.BoatBackWall);
        this.BeeHead.addChild(this.shape37);
        this.BeeHead.addChild(this.RAntenna1);
        this.SpinnyBit.addChild(this.BarrelD);
        this.SpinnyBit.addChild(this.BarrelF);
        this.SpinnyBit.addChild(this.SpinnyPt2);
        this.LWingStrutA.addChild(this.LWingA);
        this.SpinnyBit.addChild(this.BarrelE);
        this.BeeHead.addChild(this.BeeConnector1);
        this.SpinnyBit.addChild(this.BarrelH);
        this.LAntenna1.addChild(this.LAntenna2);
        this.GunBase.addChild(this.SpinnyBit);
        this.BoatBase.addChild(this.BoatLeftWall);
        this.SpinnyBit.addChild(this.BarrelB);
        this.BeeHead.addChild(this.LAntenna1);
        this.BoatBase.addChild(this.BoatRightWall);
        this.SpinnyBit.addChild(this.BarrelI);
        this.shape37.addChild(this.shape37_1);
        this.RWingStrutA.addChild(this.RWingStrutB);
        this.BoatBase.addChild(this.GunBase);
        this.RWingStrutA.addChild(this.RWingA);
        this.LWingStrutA.addChild(this.LWingStrutB);
        this.SpinnyBit.addChild(this.BarrelC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f,f1,f2,f3,f4,f5, entity);
        this.BoatBase.render(f5);
        this.BeeTorso.render(f5);
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
        this.SpinnyBit.rotateAngleZ = (MathHelper.sin(limbSwing * 0.6662F) * 5F * ageInTicks);
        this.LWingStrutA.rotateAngleX = (MathHelper.sin(limbSwing * 0.6662F) * 7F  * ageInTicks);
        this.RWingStrutA.rotateAngleX = (MathHelper.sin(limbSwing * 0.6662F) * 7F  * ageInTicks);
    }

}
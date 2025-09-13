package com.mco.wackyguesses.entities.floatBeeGunner.bee;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelBee - TheMCOverlordYT
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelBee extends ModelBase
{
    public ModelRenderer BeeTorso;
    public ModelRenderer BeeHead;
    public ModelRenderer LWingStrutA;
    public ModelRenderer RWingStrutA;
    public ModelRenderer BeeTorsoB;
    public ModelRenderer LAntenna1;
    public ModelRenderer RAntenna1;
    public ModelRenderer shape37;
    public ModelRenderer BeeConnector1;
    public ModelRenderer LAntenna2;
    public ModelRenderer RAntenna2;
    public ModelRenderer shape37_1;
    public ModelRenderer LWingStrutB;
    public ModelRenderer LWingA;
    public ModelRenderer LWingB;
    public ModelRenderer RWingStrutB;
    public ModelRenderer RWingA;
    public ModelRenderer RWingStrutB_1;
    public ModelRenderer BeeTorsoC;
    public ModelRenderer Stinger;

    public ModelBee() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.BeeHead = new ModelRenderer(this, 25, 10);
        this.BeeHead.setRotationPoint(6.5F, -12.0F, 1.0F);
        this.BeeHead.addBox(-6.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F);
        this.BeeTorsoC = new ModelRenderer(this, 11, 4);
        this.BeeTorsoC.setRotationPoint(1.0F, 4.0F, 2.0F);
        this.BeeTorsoC.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(this.BeeTorsoC, -0.5462880558742251F, 0.0F, 0.0F);
        this.LWingStrutA = new ModelRenderer(this, 0, 95);
        this.LWingStrutA.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.LWingStrutA.addBox(-7.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.LWingStrutA, 0.0F, 0.0F, 0.8196066167365371F);
        this.RWingStrutB = new ModelRenderer(this, 0, 95);
        this.RWingStrutB.setRotationPoint(7.3F, -0.2F, 0.0F);
        this.RWingStrutB.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.RWingStrutB, 0.0F, 0.0F, 0.46059238960130355F);
        this.RAntenna2 = new ModelRenderer(this, 0, 0);
        this.RAntenna2.setRotationPoint(-0.1F, -3.8F, 1.4F);
        this.RAntenna2.addBox(0.0F, -8.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.RAntenna2, 0.36425021489121656F, -0.136659280431156F, 0.0F);
        this.LWingA = new ModelRenderer(this, 42, 31);
        this.LWingA.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.LWingA.addBox(-7.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.BeeConnector1 = new ModelRenderer(this, 0, 30);
        this.BeeConnector1.setRotationPoint(-4.0F, 7.0F, 2.2F);
        this.BeeConnector1.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(this.BeeConnector1, -0.07958701389094143F, 0.0F, 0.0F);
        this.Stinger = new ModelRenderer(this, 0, 0);
        this.Stinger.setRotationPoint(1.5F, 7.0F, 1.5F);
        this.Stinger.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(this.Stinger, -0.31869712141416456F, 0.0F, 0.0F);
        this.shape37_1 = new ModelRenderer(this, 0, 8);
        this.shape37_1.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.shape37_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LAntenna2 = new ModelRenderer(this, 0, 0);
        this.LAntenna2.setRotationPoint(0.7F, -3.8F, 1.6F);
        this.LAntenna2.addBox(0.0F, -8.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.LAntenna2, 0.36425021489121656F, 0.136659280431156F, -0.136659280431156F);
        this.LWingB = new ModelRenderer(this, 25, 31);
        this.LWingB.setRotationPoint(0.1F, 0.3F, 0.5F);
        this.LWingB.addBox(-7.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.RWingA = new ModelRenderer(this, 42, 31);
        this.RWingA.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.RWingA.addBox(0.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.LWingStrutB = new ModelRenderer(this, 0, 95);
        this.LWingStrutB.setRotationPoint(-7.3F, 0.3F, 0.0F);
        this.LWingStrutB.addBox(-7.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.LWingStrutB, 0.0F, 0.0F, -0.46059238960130355F);
        this.BeeTorso = new ModelRenderer(this, 0, 41);
        this.BeeTorso.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.BeeTorso.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.BeeTorsoB = new ModelRenderer(this, 0, 17);
        this.BeeTorsoB.setRotationPoint(1.0F, 8.0F, 1.0F);
        this.BeeTorsoB.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(this.BeeTorsoB, -0.3490658503988659F, 0.0F, 0.0F);
        this.LAntenna1 = new ModelRenderer(this, 0, 0);
        this.LAntenna1.setRotationPoint(-5.0F, 3.0F, 1.0F);
        this.LAntenna1.addBox(0.0F, -8.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.LAntenna1, 0.136659280431156F, 0.136659280431156F, 0.0F);
        this.shape37 = new ModelRenderer(this, 0, 11);
        this.shape37.setRotationPoint(-4.0F, 3.0F, -2.0F);
        this.shape37.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
        this.RWingStrutB_1 = new ModelRenderer(this, 25, 31);
        this.RWingStrutB_1.setRotationPoint(0.0F, 1.0F, 0.5F);
        this.RWingStrutB_1.addBox(0.0F, 0.0F, 0.0F, 8, 7, 0, 0.0F);
        this.RWingStrutA = new ModelRenderer(this, 0, 95);
        this.RWingStrutA.setRotationPoint(7.0F, 2.0F, 4.0F);
        this.RWingStrutA.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.setRotateAngle(this.RWingStrutA, 0.0F, 0.0F, -0.8107054375513661F);
        this.RAntenna1 = new ModelRenderer(this, 0, 0);
        this.RAntenna1.setRotationPoint(-1.0F, 3.0F, 1.0F);
        this.RAntenna1.addBox(0.0F, -8.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.RAntenna1, 0.136659280431156F, -0.136659280431156F, 0.0F);
        this.BeeTorso.addChild(this.BeeHead);
        this.BeeTorsoB.addChild(this.BeeTorsoC);
        this.BeeTorso.addChild(this.LWingStrutA);
        this.RWingStrutA.addChild(this.RWingStrutB);
        this.RAntenna1.addChild(this.RAntenna2);
        this.LWingStrutA.addChild(this.LWingA);
        this.BeeHead.addChild(this.BeeConnector1);
        this.BeeTorsoC.addChild(this.Stinger);
        this.shape37.addChild(this.shape37_1);
        this.LAntenna1.addChild(this.LAntenna2);
        this.LWingStrutB.addChild(this.LWingB);
        this.RWingStrutA.addChild(this.RWingA);
        this.LWingStrutA.addChild(this.LWingStrutB);
        this.BeeTorso.addChild(this.BeeTorsoB);
        this.BeeHead.addChild(this.LAntenna1);
        this.BeeHead.addChild(this.shape37);
        this.RWingStrutB.addChild(this.RWingStrutB_1);
        this.BeeTorso.addChild(this.RWingStrutA);
        this.BeeHead.addChild(this.RAntenna1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f1, f2, f3, f4, f5, f, entity);
        this.BeeTorso.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
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
        this.LWingStrutA.rotateAngleX = (MathHelper.sin(limbSwing * 0.6662F) * 7F  * ageInTicks);
        this.RWingStrutA.rotateAngleX = (MathHelper.sin(limbSwing * 0.6662F) * 7F  * ageInTicks);
    }

}
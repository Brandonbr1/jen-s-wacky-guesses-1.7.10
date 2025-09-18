package com.mco.wackyguesses.entities.sunUrchin.projectile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelSunSpike extends ModelBase {
    public ModelRenderer SpikeA;
    public ModelRenderer SpikeB;
    public ModelRenderer SpikeC;

    public ModelSunSpike() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.SpikeB = new ModelRenderer(this, 13, 0);
        this.SpikeB.setRotationPoint(-1.3F, -4.0F, -1.5F);
        this.SpikeB.addBox(0.0F, -7.0F, 0.0F, 2, 8, 2, 0.0F);
        this.SpikeC = new ModelRenderer(this, 22, 0);
        this.SpikeC.setRotationPoint(0.5F, -8.0F, 0.5F);
        this.SpikeC.addBox(0.0F, -10.0F, 0.0F, 1, 11, 1, 0.0F);
        this.SpikeA = new ModelRenderer(this, 0, 0);
        this.SpikeA.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.SpikeA.addBox(-1.7F, -3.0F, -2.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(this.SpikeA, 1.5707964F, -1.5707964F, 0.0F);
        this.SpikeA.addChild(this.SpikeB);
        this.SpikeB.addChild(this.SpikeC);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.SpikeA.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
package com.mco.wackyguesses.entities.jupiter.asteroid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelAsteroid extends ModelBase {
    public ModelRenderer AsteroidA;
    public ModelRenderer AsteroidB;
    public ModelRenderer AsteroidC;
    public ModelRenderer AsteroidD;

    public ModelAsteroid() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.AsteroidB = new ModelRenderer(this, 0, 0);
        this.AsteroidB.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.AsteroidB.addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
        this.AsteroidC = new ModelRenderer(this, 0, 0);
        this.AsteroidC.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.AsteroidC.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.AsteroidA = new ModelRenderer(this, 0, 0);
        this.AsteroidA.setRotationPoint(-3.0F, 11.0F, -3.0F);
        this.AsteroidA.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.AsteroidD = new ModelRenderer(this, 0, 0);
        this.AsteroidD.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.AsteroidD.addBox(0.0F, 0.0F, 0.0F, 4, 4, 8, 0.0F);
        this.AsteroidA.addChild(this.AsteroidB);
        this.AsteroidA.addChild(this.AsteroidC);
        this.AsteroidA.addChild(this.AsteroidD);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.AsteroidA.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
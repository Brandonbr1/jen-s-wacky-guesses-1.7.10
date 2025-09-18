package com.mco.wackyguesses.entities.fettucine.box;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBoxOfNoodles extends ModelBase {
    public ModelRenderer Box;

    public ModelBoxOfNoodles() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Box = new ModelRenderer(this, 0, 0);
        this.Box.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.Box.addBox(-17.0F, -55.0F, -9.0F, 34, 56, 19, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Box.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
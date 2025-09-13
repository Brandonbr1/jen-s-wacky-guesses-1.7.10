package com.mco.wackyguesses.entities.chocolate.box;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelChocoBox - TheMCO
 * Created using Tabula 4.1.1
 */
@SideOnly(Side.CLIENT)
public class ModelChocoBox extends ModelBase {
    public ModelRenderer BoxBase;
    public ModelRenderer BackSide;
    public ModelRenderer FrontSide;
    public ModelRenderer LeftSide;
    public ModelRenderer RightSide;
    public ModelRenderer Sphere1A;
    public ModelRenderer Rectangle1;
    public ModelRenderer Square1;
    public ModelRenderer Sphere2A;
    public ModelRenderer Rectangle2;
    public ModelRenderer Sphere3A;
    public ModelRenderer Rectangle3;
    public ModelRenderer Square2;
    public ModelRenderer Rectangle4;
    public ModelRenderer Square3;
    public ModelRenderer Sphere4A;
    public ModelRenderer Sphere5A;
    public ModelRenderer Sphere1B;
    public ModelRenderer Sphere1C;
    public ModelRenderer Sphere1D;
    public ModelRenderer Sphere1B_1;
    public ModelRenderer Sphere1C_1;
    public ModelRenderer Sphere1D_1;
    public ModelRenderer Sphere1B_2;
    public ModelRenderer Sphere1C_2;
    public ModelRenderer Sphere1D_2;
    public ModelRenderer Sphere1B_3;
    public ModelRenderer Sphere1C_3;
    public ModelRenderer Sphere1D_3;
    public ModelRenderer Sphere1B_4;
    public ModelRenderer Sphere1C_4;
    public ModelRenderer Sphere1D_4;

    public ModelChocoBox() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Rectangle4 = new ModelRenderer(this, 45, 36);
        this.Rectangle4.setRotationPoint(4.0F, 21.0F, -9.0F);
        this.Rectangle4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(this.Rectangle4, 0.0F, 0.07452555906015787F, 0.0F);
        this.Sphere1C = new ModelRenderer(this, 0, 0);
        this.Sphere1C.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Sphere1C.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Sphere1D_1 = new ModelRenderer(this, 0, 0);
        this.Sphere1D_1.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.Sphere1D_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Sphere4A = new ModelRenderer(this, 0, 6);
        this.Sphere4A.setRotationPoint(4.0F, 21.0F, 2.8F);
        this.Sphere4A.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.Sphere4A, 0.0F, 0.47752208334564855F, 0.0F);
        this.Rectangle2 = new ModelRenderer(this, 33, 29);
        this.Rectangle2.setRotationPoint(-2.0F, 21.0F, -8.0F);
        this.Rectangle2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
        this.setRotateAngle(this.Rectangle2, 0.0F, 1.0382963720114267F, 0.0F);
        this.Sphere1C_3 = new ModelRenderer(this, 0, 0);
        this.Sphere1C_3.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Sphere1C_3.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Sphere1C_1 = new ModelRenderer(this, 0, 0);
        this.Sphere1C_1.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Sphere1C_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Sphere1B_4 = new ModelRenderer(this, 0, 0);
        this.Sphere1B_4.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Sphere1B_4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Sphere1D_2 = new ModelRenderer(this, 0, 0);
        this.Sphere1D_2.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.Sphere1D_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Sphere1B = new ModelRenderer(this, 0, 0);
        this.Sphere1B.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Sphere1B.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.RightSide = new ModelRenderer(this, 0, 15);
        this.RightSide.setRotationPoint(15.1F, 23.0F, -11.0F);
        this.RightSide.addBox(-7.0F, -3.0F, 0.0F, 0, 4, 22, 0.0F);
        this.Square3 = new ModelRenderer(this, 11, 26);
        this.Square3.setRotationPoint(5.0F, 21.0F, -3.0F);
        this.Square3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(this.Square3, 0.0F, -0.6375687757535285F, 0.0F);
        this.Sphere1D = new ModelRenderer(this, 0, 0);
        this.Sphere1D.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.Sphere1D.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.BoxBase = new ModelRenderer(this, 0, 0);
        this.BoxBase.setRotationPoint(-8.0F, 23.0F, 10.0F);
        this.BoxBase.addBox(0.0F, -1.0F, -21.0F, 16, 2, 22, 0.0F);
        this.Rectangle3 = new ModelRenderer(this, 0, 12);
        this.Rectangle3.setRotationPoint(1.0F, 21.0F, 0.0F);
        this.Rectangle3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(this.Rectangle3, 0.0F, -0.420449816805434F, 0.0F);
        this.Sphere1C_4 = new ModelRenderer(this, 0, 0);
        this.Sphere1C_4.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Sphere1C_4.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Square2 = new ModelRenderer(this, 11, 26);
        this.Square2.setRotationPoint(0.0F, 21.0F, 6.0F);
        this.Square2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(this.Square2, 0.0F, -0.7504915783575618F, 0.0F);
        this.Sphere1A = new ModelRenderer(this, 0, 6);
        this.Sphere1A.setRotationPoint(-6.0F, 20.0F, -9.0F);
        this.Sphere1A.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.Sphere1A, 0.0F, 0.03473205211468716F, 0.0F);
        this.Sphere3A = new ModelRenderer(this, 0, 6);
        this.Sphere3A.setRotationPoint(0.0F, 21.0F, -4.2F);
        this.Sphere3A.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.Sphere3A, 0.0F, -0.3560471674068432F, 0.0F);
        this.Sphere1D_3 = new ModelRenderer(this, 0, 0);
        this.Sphere1D_3.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.Sphere1D_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Sphere2A = new ModelRenderer(this, 0, 6);
        this.Sphere2A.setRotationPoint(-6.0F, 21.0F, 7.0F);
        this.Sphere2A.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.Sphere2A, 0.0F, 0.3300417615521277F, 0.0F);
        this.Sphere1B_3 = new ModelRenderer(this, 0, 0);
        this.Sphere1B_3.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Sphere1B_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.BackSide = new ModelRenderer(this, 0, 30);
        this.BackSide.setRotationPoint(-1.0F, 23.0F, 11.1F);
        this.BackSide.addBox(-7.0F, -3.0F, 0.0F, 16, 4, 0, 0.0F);
        this.Square1 = new ModelRenderer(this, 11, 26);
        this.Square1.setRotationPoint(-5.0F, 21.0F, 1.0F);
        this.Square1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(this.Square1, 0.0F, -0.10786134777324957F, 0.0F);
        this.FrontSide = new ModelRenderer(this, 0, 30);
        this.FrontSide.setRotationPoint(-1.0F, 23.0F, -11.1F);
        this.FrontSide.addBox(-7.0F, -3.0F, 0.0F, 16, 4, 0, 0.0F);
        this.LeftSide = new ModelRenderer(this, 0, 15);
        this.LeftSide.setRotationPoint(-1.1F, 23.0F, -11.0F);
        this.LeftSide.addBox(-7.0F, -3.0F, 0.0F, 0, 4, 22, 0.0F);
        this.Sphere1C_2 = new ModelRenderer(this, 0, 0);
        this.Sphere1C_2.setRotationPoint(-0.5F, 0.5F, 0.5F);
        this.Sphere1C_2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.Rectangle1 = new ModelRenderer(this, 0, 25);
        this.Rectangle1.setRotationPoint(-5.0F, 21.0F, -4.0F);
        this.Rectangle1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.Rectangle1, 0.0F, 0.3436553297176835F, 0.0F);
        this.Sphere1B_1 = new ModelRenderer(this, 0, 0);
        this.Sphere1B_1.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Sphere1B_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Sphere1B_2 = new ModelRenderer(this, 0, 0);
        this.Sphere1B_2.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.Sphere1B_2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.Sphere5A = new ModelRenderer(this, 0, 6);
        this.Sphere5A.setRotationPoint(4.2F, 21.0F, 7.1F);
        this.Sphere5A.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.Sphere5A, 0.0F, -0.1998401993533507F, 0.0F);
        this.Sphere1D_4 = new ModelRenderer(this, 0, 0);
        this.Sphere1D_4.setRotationPoint(0.5F, 0.5F, -0.5F);
        this.Sphere1D_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Sphere1A.addChild(this.Sphere1C);
        this.Sphere2A.addChild(this.Sphere1D_1);
        this.Sphere4A.addChild(this.Sphere1C_3);
        this.Sphere2A.addChild(this.Sphere1C_1);
        this.Sphere5A.addChild(this.Sphere1B_4);
        this.Sphere3A.addChild(this.Sphere1D_2);
        this.Sphere1A.addChild(this.Sphere1B);
        this.Sphere1A.addChild(this.Sphere1D);
        this.Sphere5A.addChild(this.Sphere1C_4);
        this.Sphere4A.addChild(this.Sphere1D_3);
        this.Sphere4A.addChild(this.Sphere1B_3);
        this.Sphere3A.addChild(this.Sphere1C_2);
        this.Sphere2A.addChild(this.Sphere1B_1);
        this.Sphere3A.addChild(this.Sphere1B_2);
        this.Sphere5A.addChild(this.Sphere1D_4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Rectangle4.render(f5);
        this.Sphere4A.render(f5);
        this.Rectangle2.render(f5);
        this.RightSide.render(f5);
        this.Square3.render(f5);
        this.BoxBase.render(f5);
        this.Rectangle3.render(f5);
        this.Square2.render(f5);
        this.Sphere1A.render(f5);
        this.Sphere3A.render(f5);
        this.Sphere2A.render(f5);
        this.BackSide.render(f5);
        this.Square1.render(f5);
        this.FrontSide.render(f5);
        this.LeftSide.render(f5);
        this.Rectangle1.render(f5);
        this.Sphere5A.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
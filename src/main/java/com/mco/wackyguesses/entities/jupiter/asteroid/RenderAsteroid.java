package com.mco.wackyguesses.entities.jupiter.asteroid;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderAsteroid extends Render{

    private static final String MOB_TEXTURE = ":textures/entities/asteroid.png";

    private ModelAsteroid model = new ModelAsteroid();

    // taken from RenderWitherSkull
    private float func_82400_a(float p_82400_1_, float p_82400_2_, float p_82400_3_)
    {
        float f3;

        for (f3 = p_82400_2_ - p_82400_1_; f3 < -180.0F; f3 += 360.0F) {
            ;
        }

        while (f3 >= 180.0F) {
            f3 -= 360.0F;
        }

        return p_82400_1_ + p_82400_3_ * f3;
    }



    public void doRender(EntityAsteroid p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_CULL_FACE);
        float f2 = this.func_82400_a(p_76986_1_.prevRotationYaw, p_76986_1_.rotationYaw, p_76986_9_);
        float f3 = p_76986_1_.prevRotationPitch + (p_76986_1_.rotationPitch - p_76986_1_.prevRotationPitch) * p_76986_9_;
        GL11.glTranslatef((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
        float f4 = 0.0625F;
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glTranslatef(0.0F, -1.6F, 0.0F);
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        this.bindEntityTexture(p_76986_1_);
        this.model.render(p_76986_1_, 0.0F, 0.0F, 0.0F, f2, f3, f4);
        GL11.glPopMatrix();
    }

    @Override
    public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        this.doRender((EntityAsteroid)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);

    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

package com.mco.wackyguesses.entities.pepper;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderPepperShaker extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/pepper_shaker.png";

    public RenderPepperShaker() {
        super(new ModelPepperShaker(), 1.0f);
        // TODO Auto-generated constructor stub
    }


    protected void preRenderCallback(EntityPepperShaker entityLiving, float partialTickTime)
    {
        GL11.glScalef(1.5F, 1.5F, 1.5F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        this.preRenderCallback((EntityPepperShaker)entityLiving, partialTickTime);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

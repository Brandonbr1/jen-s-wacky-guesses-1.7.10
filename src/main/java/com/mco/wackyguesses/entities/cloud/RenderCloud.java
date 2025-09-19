package com.mco.wackyguesses.entities.cloud;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderCloud extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/cloud.png";

    public RenderCloud() {
        super(new ModelCloud(), 0.5f);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        GL11.glScalef(2F, 2F, 2F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

package com.mco.wackyguesses.entities.jupiter;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderJupiter extends RenderLiving
{
    private static final String MOB_TEXTURE = ":textures/entities/jupiter.png";

    public RenderJupiter() {
        super(new ModelJupiter(), 1.0f);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        GL11.glScalef(2.0f, 2.0f, 2.0f);
    }



    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

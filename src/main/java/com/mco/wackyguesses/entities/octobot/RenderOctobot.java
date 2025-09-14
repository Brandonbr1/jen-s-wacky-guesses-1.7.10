package com.mco.wackyguesses.entities.octobot;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderOctobot extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/octobot.png";
    private static final ResourceLocation octobotTextures = new ResourceLocation("wackyguesses:textures/entities/tractor_beam.png");

    public RenderOctobot() {
        super(new ModelOctobot(), 0.7f);
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

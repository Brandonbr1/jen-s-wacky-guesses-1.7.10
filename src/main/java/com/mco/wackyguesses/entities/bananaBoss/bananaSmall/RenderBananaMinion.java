package com.mco.wackyguesses.entities.bananaBoss.bananaSmall;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.entities.bananaBoss.ModelBanana;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBananaMinion extends RenderLiving
{
    private static final String MOB_TEXTURE = ":textures/entities/banana_boss.png";

    public RenderBananaMinion()
    {
        super(new ModelBanana(), 0.25f);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        super.preRenderCallback(entityLiving, partialTickTime);
        GL11.glScalef(0.37F, 0.37F, 0.37F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

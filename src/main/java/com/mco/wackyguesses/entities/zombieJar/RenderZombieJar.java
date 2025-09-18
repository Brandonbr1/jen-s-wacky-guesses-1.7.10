package com.mco.wackyguesses.entities.zombieJar;

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
public class RenderZombieJar extends RenderLiving
{
    private static final String MOB_TEXTURE = ":textures/entities/zombie_jar.png";
    private static final String CRACKED_1 = ":textures/entities/zombie_jar_cracked_1.png";
    private static final String CRACKED_2 = ":wackyguesses:textures/entities/zombie_jar_cracked_2.png";

    public RenderZombieJar() {
        super(new ModelZombieJar(), 1.0f);
        // TODO Auto-generated constructor stub
    }

    protected void preRenderCallback(EntityZombieJar entityLiving, float partialTickTime)
    {
        GL11.glScalef(1.5F, 1.5F, 1.5F);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        this.preRenderCallback((EntityZombieJar)entityLiving, partialTickTime);
    }

    protected ResourceLocation getEntityTexture(EntityZombieJar entity)
    {
        if (entity.getHealth() <= entity.getMaxHealth() * 1.0F / 3.0F)
            return new ResourceLocation(Wacky.MODID + CRACKED_2);
        else
            return entity.getHealth() >= entity.getMaxHealth() * 1.0F / 3.0F && entity.getHealth() <= entity.getMaxHealth() * 2.0F / 3.0F ? new ResourceLocation(Wacky.MODID + CRACKED_1) : new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityZombieJar)p_110775_1_);
    }



}

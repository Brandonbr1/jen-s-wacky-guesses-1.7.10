package com.mco.wackyguesses.entities.egg;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderEgg extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/egg.png";

    public RenderEgg() {
        super(new ModelEgg(), 1.0f);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        GL11.glScalef(3F, 3F, 3F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {

        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

package com.mco.wackyguesses.entities.bananamobile;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBananamobile extends RenderLiving
{
    private static final String MOB_TEXTURE = ":textures/entities/bananamobile.png";

    public RenderBananamobile() {
        super(new ModelBananamobile(), 1.0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {

        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

package com.mco.wackyguesses.entities.bananaBoss;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBanana extends RenderLiving
{
    private static final String MOB_TEXTURE = ":textures/entities/banana_boss.png";

    public RenderBanana() {
        super(new ModelBanana(), 1.0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

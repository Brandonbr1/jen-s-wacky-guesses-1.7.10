package com.mco.wackyguesses.entities.chocolate.sphere;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSphericalChoco extends RenderLiving
{
    public static final String[] CHOCO_TEXTURES = new String[] {"wackyguesses:textures/entities/spherical_choco_dark.png", "wackyguesses:textures/entities/spherical_choco_milk.png", "wackyguesses:textures/entities/spherical_choco_nut.png", "wackyguesses:textures/entities/spherical_choco_white.png"};

    public RenderSphericalChoco() {
        super(new ModelSphericalChoco(), 0.7f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        EntitySphericalChoco choco = (EntitySphericalChoco)entity;
        return new ResourceLocation(CHOCO_TEXTURES[choco.getTextureInt()]);
    }


}

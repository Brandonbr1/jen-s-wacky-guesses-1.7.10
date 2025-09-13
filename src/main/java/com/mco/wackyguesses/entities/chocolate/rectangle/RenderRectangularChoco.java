package com.mco.wackyguesses.entities.chocolate.rectangle;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderRectangularChoco extends RenderLiving
{
    public static final String[] CHOCO_TEXTURES = new String[] {"wackyguesses:textures/entities/rectangular_choco_dark.png", "wackyguesses:textures/entities/rectangular_choco_milk.png", "wackyguesses:textures/entities/rectangular_choco_nut.png", "wackyguesses:textures/entities/rectangular_choco_white.png"};
    public RenderRectangularChoco() {
        super(new ModelRectangularChoco(), 1.0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        EntityRectangularChoco choco = (EntityRectangularChoco)entity;
        return new ResourceLocation(CHOCO_TEXTURES[choco.getTextureInt()]);
    }


}

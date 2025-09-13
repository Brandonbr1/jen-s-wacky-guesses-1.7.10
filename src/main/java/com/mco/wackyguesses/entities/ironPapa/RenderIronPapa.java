package com.mco.wackyguesses.entities.ironPapa;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderIronPapa extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/iron_papa.png";

    public RenderIronPapa() {
        super(new ModelIronPapa(), 1.0f);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

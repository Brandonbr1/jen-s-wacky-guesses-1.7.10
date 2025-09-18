package com.mco.wackyguesses.entities.fettucine.noodle;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderFettuccineNoodle extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/fettuccine_noodle.png";

    public RenderFettuccineNoodle() {
        super(new ModelFettuccineNoodle(), 0.5f);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

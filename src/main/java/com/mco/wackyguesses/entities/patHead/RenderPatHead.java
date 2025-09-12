package com.mco.wackyguesses.entities.patHead;

import com.mco.wackyguesses.Wacky;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPatHead extends RenderLiving
{

    private static final String MOB_TEXTURE = "textures/entities/pat_head.png";

    public RenderPatHead() {
        super(new ModelPatHead(), 1.0f);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

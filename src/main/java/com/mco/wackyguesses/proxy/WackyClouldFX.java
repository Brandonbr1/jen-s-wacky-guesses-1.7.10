package com.mco.wackyguesses.proxy;

import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.world.World;

public class WackyClouldFX extends EntityCloudFX
{

    public WackyClouldFX(World p_i1221_1_, double p_i1221_2_, double p_i1221_4_, double p_i1221_6_, double p_i1221_8_, double p_i1221_10_, double p_i1221_12_) {
        super(p_i1221_1_, p_i1221_2_, p_i1221_4_, p_i1221_6_, p_i1221_8_, p_i1221_10_, p_i1221_12_);
        this.particleScale = 2.5F;
        this.particleAge = this.particleMaxAge / 2;
    }

}

package com.mco.wackyguesses.proxy;

import net.minecraft.client.particle.EntityCloudFX;
import net.minecraft.world.World;

public class WackyClouldFX extends EntityCloudFX
{
    public WackyClouldFX(World world, double xCoord, double yCoord, double zCoord, double mx, double my, double mz) {
        super(world, xCoord, yCoord, zCoord, mz, my, mz);
        this.particleScale = 2.5F;
        this.particleAge = this.particleMaxAge / 2;
        this.noClip = false;
    }
}

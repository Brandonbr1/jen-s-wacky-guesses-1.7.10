package com.mco.wackyguesses.entities.dorito.doritoThrowable;

import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDoritoThrowable extends EntityThrowable
{

    public EntityDoritoThrowable(World p_i1777_1_, EntityLivingBase p_i1777_2_)
    {
        super(p_i1777_1_, p_i1777_2_);
        // TODO Auto-generated constructor stub
    }

    public EntityDoritoThrowable(World p_i1778_1_, double p_i1778_2_, double p_i1778_4_, double p_i1778_6_)
    {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
        // TODO Auto-generated constructor stub
    }

    public EntityDoritoThrowable(World p_i1776_1_)
    {
        super(p_i1776_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
        if (p_70184_1_.entityHit != null)
        {
            byte b0 = 1;
            p_70184_1_.entityHit.attackEntityFrom(WackyDamages.dorito, b0);
        }

        for (int i = 0; i < 8; ++i)
        {
            this.worldObj.spawnParticle("redstone", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }

    }

    @Override
    protected float getGravityVelocity()
    {
        return 0.01F;
    }


}

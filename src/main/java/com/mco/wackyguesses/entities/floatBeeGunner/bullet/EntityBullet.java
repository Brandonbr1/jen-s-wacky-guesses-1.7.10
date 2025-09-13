package com.mco.wackyguesses.entities.floatBeeGunner.bullet;

import com.mco.wackyguesses.source.WackyDamageSource;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable
{
    public EntityBullet(World p_i1777_1_, EntityLivingBase p_i1777_2_)
    {
        super(p_i1777_1_, p_i1777_2_);
        // TODO Auto-generated constructor stub
    }

    public EntityBullet(World p_i1778_1_, double p_i1778_2_, double p_i1778_4_, double p_i1778_6_)
    {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
        // TODO Auto-generated constructor stub
    }

    public EntityBullet(World p_i1776_1_)
    {
        super(p_i1776_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {
        if (p_70184_1_.entityHit != null) {
            float b0 = 0.5f;
            p_70184_1_.entityHit.attackEntityFrom(WackyDamageSource.bullet, b0);
        }


        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    @Override
    protected float getGravityVelocity()
    {
        return 0.01F;
    }

}

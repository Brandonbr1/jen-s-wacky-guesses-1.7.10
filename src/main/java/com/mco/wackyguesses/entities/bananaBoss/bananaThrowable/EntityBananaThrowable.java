package com.mco.wackyguesses.entities.bananaBoss.bananaThrowable;

import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBananaThrowable extends EntityThrowable{


    public EntityBananaThrowable(World p_i1777_1_, EntityLivingBase p_i1777_2_)
    {
        super(p_i1777_1_, p_i1777_2_);
        // TODO Auto-generated constructor stub
    }

    public EntityBananaThrowable(World p_i1778_1_, double p_i1778_2_, double p_i1778_4_, double p_i1778_6_)
    {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
        // TODO Auto-generated constructor stub
    }

    public EntityBananaThrowable(World p_i1776_1_)
    {
        super(p_i1776_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {
        if (p_70184_1_.entityHit != null) {
            byte b0 = 1;

            p_70184_1_.entityHit.attackEntityFrom(WackyDamages.banana, b0);
        }


        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }



}

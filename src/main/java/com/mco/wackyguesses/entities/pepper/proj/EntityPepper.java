package com.mco.wackyguesses.entities.pepper.proj;

import com.mco.wackyguesses.entities.pepper.EntityPepperShaker;
import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPepper extends EntityThrowable
{

    public EntityPepper(World p_i1777_1_, EntityLivingBase p_i1777_2_)
    {
        super(p_i1777_1_, p_i1777_2_);
        // TODO Auto-generated constructor stub
    }

    public EntityPepper(World p_i1778_1_, double p_i1778_2_, double p_i1778_4_, double p_i1778_6_)
    {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
        // TODO Auto-generated constructor stub
    }

    public EntityPepper(World p_i1776_1_)
    {
        super(p_i1776_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onImpact(MovingObjectPosition result)
    {
        if (result.entityHit != null && !(result.entityHit instanceof EntityPepperShaker)) {
            result.entityHit.attackEntityFrom(WackyDamages.PEPPER, 1.0F);
        }

        if (!this.worldObj.isRemote) {
            this.setDead();
        }



    }

}

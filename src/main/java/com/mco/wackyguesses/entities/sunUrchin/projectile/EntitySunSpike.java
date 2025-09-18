package com.mco.wackyguesses.entities.sunUrchin.projectile;

import com.mco.wackyguesses.source.WackyDamages;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySunSpike extends EntityThrowable{

    public EntitySunSpike(World p_i1777_1_, EntityLivingBase p_i1777_2_)
    {
        super(p_i1777_1_, p_i1777_2_);
        this.setSize(2.0F, 0.3F);
        // TODO Auto-generated constructor stub
    }

    public EntitySunSpike(World p_i1778_1_, double p_i1778_2_, double p_i1778_4_, double p_i1778_6_)
    {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
        this.setSize(2.0F, 0.3F);
        // TODO Auto-generated constructor stub
    }

    public EntitySunSpike(World p_i1776_1_)
    {
        super(p_i1776_1_);
        this.setSize(2.0F, 0.3F);
        // TODO Auto-generated constructor stub
    }

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id) {
        /**
         * TODO: ADD
        if (id == 3) {
            for(int i = 0; i < 8; ++i) {
              this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);

         }
        }
         **/

    }

    @Override
    protected void onImpact(MovingObjectPosition result) {
        if (result.entityHit != null) {
            result.entityHit.attackEntityFrom(WackyDamages.SPIKE, 6.0F);
        }

        if (!this.worldObj.isRemote) {
            this.worldObj.setEntityState(this, (byte)3);
            this.setDead();
        }

    }


    @Override
    protected float getGravityVelocity() {
        return 0.001F;
    }

}

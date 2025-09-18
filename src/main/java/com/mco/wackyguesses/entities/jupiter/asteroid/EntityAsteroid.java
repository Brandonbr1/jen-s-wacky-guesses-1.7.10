package com.mco.wackyguesses.entities.jupiter.asteroid;

import com.mco.wackyguesses.source.WackyDamages;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityAsteroid extends EntityFireball
{

    public EntityAsteroid(World p_i1761_1_, EntityLivingBase p_i1761_2_, double p_i1761_3_, double p_i1761_5_, double p_i1761_7_) {
        super(p_i1761_1_, p_i1761_2_, p_i1761_3_, p_i1761_5_, p_i1761_7_);
        this.setSize(1.245F, 0.6225F);
        // TODO Auto-generated constructor stub
    }

    public EntityAsteroid(World p_i1759_1_) {
        super(p_i1759_1_);
        this.setSize(1.245F, 0.6225F);
    }

    @SideOnly(Side.CLIENT)
    public EntityAsteroid(World p_i1795_1_, double p_i1795_2_, double p_i1795_4_, double p_i1795_6_, double p_i1795_8_, double p_i1795_10_, double p_i1795_12_) {
        super(p_i1795_1_, p_i1795_2_, p_i1795_4_, p_i1795_6_, p_i1795_8_, p_i1795_10_, p_i1795_12_);
        this.setSize(0.3125F, 0.3125F);
    }

    @Override
    public boolean isBurning() {
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        return false;
    }

    @Override
    protected float getMotionFactor() {
        return super.getMotionFactor();
    }

    @Override
    protected void onImpact(MovingObjectPosition result)
    {
        if (!this.worldObj.isRemote) {
            if (result.entityHit != null) {
                if (this.shootingEntity != null) {
                    result.entityHit.attackEntityFrom(WackyDamages.ASTEROID, 2.0F);
                }
            }

            this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 1.5F, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
            this.setDead();
        }

        if (this.shootingEntity == null) {
            this.setDead();
        }

    }

}

package com.mco.wackyguesses.entities.fettucine.projectile;

import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityNoodleProjectile extends EntityFireball
{

    public EntityNoodleProjectile(World p_i1761_1_, EntityLivingBase p_i1761_2_, double p_i1761_3_, double p_i1761_5_, double p_i1761_7_) {
        super(p_i1761_1_, p_i1761_2_, p_i1761_3_, p_i1761_5_, p_i1761_7_);
        this.setSize(1.245F, 0.6225F);
        // TODO Auto-generated constructor stub
    }

    public EntityNoodleProjectile(World p_i1760_1_, double p_i1760_2_, double p_i1760_4_, double p_i1760_6_, double p_i1760_8_, double p_i1760_10_, double p_i1760_12_) {
        super(p_i1760_1_, p_i1760_2_, p_i1760_4_, p_i1760_6_, p_i1760_8_, p_i1760_10_, p_i1760_12_);
        this.setSize(1.245F, 0.6225F);
    }

    public EntityNoodleProjectile(World p_i1759_1_) {
        super(p_i1759_1_);
        this.setSize(1.245F, 0.6225F);
    }

    @Override
    protected void onImpact(MovingObjectPosition result)
    {
        if (!this.worldObj.isRemote)
        {
            if (result.entityHit != null)
            {
                result.entityHit.attackEntityFrom(WackyDamages.NOODLE, 4.0F);
            }
            this.setDead();
        }

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

}

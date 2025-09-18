package com.mco.wackyguesses.entities.sunUrchin;

import com.mco.wackyguesses.entities.sunUrchin.projectile.EntitySunSpike;
import com.mco.wackyguesses.source.WackyDamages;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySunUrchin extends EntityMob
{

    public EntitySunUrchin(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(3.0F, 3.0F);
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0D);
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (this.getHealth() >= this.getMaxHealth() / 2.0F)
        {
            if (this.ticksExisted % 20 == 0 && this.getAttackTarget() != null) {
                this.launchSunSpikeToEntity(this.getAttackTarget());
            }
        } else if (this.ticksExisted % 10 == 0 && this.getAttackTarget() != null) {
            this.launchSunSpikeToEntity(this.getAttackTarget());
        }

    }


    @Override
    public void onCollideWithPlayer(EntityPlayer entityIn)
    {
        super.onCollideWithPlayer(entityIn);
        entityIn.attackEntityFrom(WackyDamages.URCHIN, 10.0F);
    }

    public void launchSunSpikeToEntity(EntityLivingBase target)
    {
        EntitySunSpike entitySunSpike = new EntitySunSpike(this.worldObj, this);
        double d0 = target.posY + target.getEyeHeight() - 1.100000023841858D;
        double d1 = target.posX - this.posX;
        double d2 = d0 - entitySunSpike.posY;
        double d3 = target.posZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.1F;
        entitySunSpike.setPosition(this.posX, this.posY + 1.2000000476837158D, this.posZ);
        // TODO: TOO Inaccurate?
        entitySunSpike.setThrowableHeading(d1, d2 + f, d3 - 4.0D, 1.8F, 5.0F);
        this.worldObj.spawnEntityInWorld(entitySunSpike);
    }


}

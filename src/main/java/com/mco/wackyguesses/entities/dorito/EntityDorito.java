package com.mco.wackyguesses.entities.dorito;

import java.util.Random;

import com.mco.wackyguesses.entities.dorito.doritoThrowable.EntityDoritoThrowable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDorito extends EntityMob implements IBossDisplayData, IRangedAttackMob
{

    public EntityDorito(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(2F, 2F);
        this.experienceValue = 50;
        this.tasks.addTask(0, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
    }


    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        BossStatus.setBossStatus(this, false);
        Random rand = new Random();
        if(rand.nextInt(25) == 0 && this.getAttackTarget() != null)
        {
            this.attackEntityWithRangedAttack(this.getAttackTarget(), 1);
        }

        if(rand.nextInt(150) == 0 && this.getAttackTarget() != null)
        {
            for (int i = 0; i < 360; i += 7.5)
            {
                float speed = 2F;
                EntityDoritoThrowable doritoThrowable = new EntityDoritoThrowable(this.worldObj);
                doritoThrowable.motionX = Math.sin((float)Math.toRadians(i)) * speed / 8;
                doritoThrowable.motionZ = Math.cos((float)Math.toRadians(i)) * speed / 8;
                doritoThrowable.motionY = 0F;
                doritoThrowable.setPosition(this.posX, this.posY + 2, this.posZ);
                this.worldObj.spawnEntityInWorld(doritoThrowable);
            }
        }
    }


    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_)
    {
        EntityDoritoThrowable entityDoritoThrowable = new EntityDoritoThrowable(this.worldObj, this);
        double d0 = target.posY + target.getEyeHeight() - 1.100000023841858D;
        double d1 = target.posX - this.posX;
        double d2 = d0 - entityDoritoThrowable.posY;
        double d3 = target.posZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
        entityDoritoThrowable.setThrowableHeading(d1, d2 + f, d3, 1.6F, 12.0F);
        // TODO: ADD SOUNDS.
        //this.playSound(SoundEvents.ENTITY_SNOWMAN_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityDoritoThrowable);
    }


}

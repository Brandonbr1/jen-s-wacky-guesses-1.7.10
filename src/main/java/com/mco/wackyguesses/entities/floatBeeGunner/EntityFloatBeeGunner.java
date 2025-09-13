package com.mco.wackyguesses.entities.floatBeeGunner;

import java.util.List;

import com.mco.wackyguesses.entities.floatBeeGunner.bullet.EntityBullet;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFloatBeeGunner extends EntityMob implements IBossDisplayData, IRangedAttackMob
{

    public EntityFloatBeeGunner(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(2F, 2F);
        this.experienceValue = 50;
        this.getNavigator().setCanSwim(true);
        this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25D, 1, 20.0F));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
    }

    @Override
    public void onLivingUpdate()
    {
        BossStatus.setBossStatus(this, true);
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D,32.0D,32.0D));
            for(EntityPlayer entity : list)
            {
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }
        }

        this.motionY *= 0.8000000238418579D;

        if (!this.worldObj.isRemote && this.getAttackTarget() != null)
        {
            EntityLivingBase entity = this.getAttackTarget();

            if (entity != null)
            {
                if (this.posY < entity.posY )
                {
                    if (this.motionY < 0.0D)
                    {
                        this.motionY = 0.0D;
                    }

                    this.motionY += (0.5D - this.motionY) * 0.6000000238418579D;
                }

                if(this.posY < entity.posY + 2) {
                    this.motionY += .1;
                } else if(this.posY > entity.posY + 2) {
                    this.motionY -= .1;
                } else {
                    this.motionY = 0;
                }

                double d0 = entity.posX - this.posX + 2;
                double d1 = entity.posZ - this.posZ + 2;
                double d3 = d0 * d0 + d1 * d1;

                if (d3 > 9.0D)
                {
                    double d5 = MathHelper.sqrt_double(d3);
                    this.motionX += (d0 / d5 * 0.5D - this.motionX) * 0.6000000238418579D;
                    this.motionZ += (d1 / d5 * 0.5D - this.motionZ) * 0.6000000238418579D;
                }
            }
        }

        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 0.05000000074505806D)
        {
            this.rotationYaw = (float)Math.atan2(this.motionZ, this.motionX) * (180F / (float)Math.PI) - 90.0F;
        }

        super.onLivingUpdate();
    }


    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_)
    {
        EntityBullet entityBullet = new EntityBullet(this.worldObj, this);
        double d0 = target.posY + target.getEyeHeight() - 1.100000023841858D;
        double d1 = target.posX - this.posX;
        double d2 = d0 - entityBullet.posY;
        double d3 = target.posZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
        entityBullet.setThrowableHeading(d1, d2 + f, d3, 1.6F, 7.0F);
        // TODO: ADD SOUNDS
        //   if(ticksExisted % 10 == 0)
        //   this.playSound(WackySoundHandler.MINIGUN, .5F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityBullet);
    }

    @Override
    protected void fall(float p_70069_1_)
    {

    }



}

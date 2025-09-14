package com.mco.wackyguesses.entities.bananaBoss;

import java.util.List;
import java.util.Random;

import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.EntityBananaMinion;
import com.mco.wackyguesses.entities.bananaBoss.bananaThrowable.EntityBananaThrowable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityBanana extends EntityMob implements IBossDisplayData, IRangedAttackMob
{

    public EntityBanana(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(1F, 4.1F);
        this.experienceValue = 100;
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150D);
    }


    @Override
    public int getTotalArmorValue()
    {
        return 2;
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0, 32.0));
            for(EntityPlayer entity : list)
            {
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }
        }

        Random rand = new Random();
        if(rand.nextInt(100) == 1 && !this.worldObj.isRemote)
        {
            EntityBananaMinion entityBananaMinion = new EntityBananaMinion(this.worldObj);
            entityBananaMinion.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(entityBananaMinion);
        }

        if (this.getAttackTarget()!=null && !this.worldObj.isRemote && this.ticksExisted % 20 == 0) {
            this.attackEntityWithRangedAttack(this.getAttackTarget(), 10);
        }
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float p_82196_2_)
    {
        EntityBananaThrowable entityBananaThrowable = new EntityBananaThrowable(this.worldObj, this);
        double d0 = target.posY + target.getEyeHeight() - 1.100000023841858D;
        double d1 = target.posX - this.posX;
        double d2 = d0 - entityBananaThrowable.posY;
        double d3 = target.posZ - this.posZ;
        float f = MathHelper.sqrt_double(d1 * d1 + d3 * d3) * 0.2F;
        entityBananaThrowable.setThrowableHeading(d1, d2 + f, d3, 1.6F, 12.0F);
        // TODO: ADD SOUNDS
        //  this.playSound(SoundEvents.ENTITY_SNOWMAN_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityBananaThrowable);
    }


    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }



}

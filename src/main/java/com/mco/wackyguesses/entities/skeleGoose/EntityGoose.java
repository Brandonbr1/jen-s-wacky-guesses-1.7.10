package com.mco.wackyguesses.entities.skeleGoose;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityGoose extends EntityMob
{

    public float wingRotation;
    public float destPos;
    public float oFlapSpeed;
    public float oFlap;
    public float wingRotDelta = 1.0F;

    public EntityGoose(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(1.0F, 1.0F);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.8D, true));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 16.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 32, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        EntitySkeleton entityskeleton = new EntitySkeleton(this.worldObj);
        entityskeleton.setLocationAndAngles(this.posX, this.posY, this.posZ, MathHelper.wrapAngleTo180_float(this.worldObj.rand.nextFloat() * 360.0F), 0.0F);
        entityskeleton.rotationYawHead = entityskeleton.rotationYaw;
        entityskeleton.renderYawOffset = entityskeleton.rotationYaw;
        entityskeleton.onSpawnWithEgg((IEntityLivingData)null);
        this.worldObj.spawnEntityInWorld(entityskeleton);
        entityskeleton.mountEntity(this);
        entityskeleton.playLivingSound();
    }


    @Override
    protected void applyEntityAttributes()
    {;
    super.applyEntityAttributes();
    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(34.0D);
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.450000011920929D);
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.oFlap = this.wingRotation;
        this.oFlapSpeed = this.destPos;
        this.destPos = (float)(this.destPos + (this.onGround ? -1 : 4) * 0.3D);

        if (this.destPos < 0.0F) {
            this.destPos = 0.0F;
        }

        if (this.destPos > 1.0F) {
            this.destPos = 1.0F;
        }

        if (!this.onGround && this.wingRotDelta < 1.0F) {
            this.wingRotDelta = 1.0F;
        }

        this.wingRotDelta = (float)(this.wingRotDelta * 0.9D);

        if (!this.onGround && this.motionY < 0.0D) {
            this.motionY *= 0.6D;
        }

        this.wingRotation += this.wingRotDelta * 2.0F;
    }


    @Override
    protected void fall(float p_70069_1_) {}

    @Override
    public double getMountedYOffset() {
        return this.height;
    }

}

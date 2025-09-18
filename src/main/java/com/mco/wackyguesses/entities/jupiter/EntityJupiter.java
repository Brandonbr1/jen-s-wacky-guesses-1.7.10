package com.mco.wackyguesses.entities.jupiter;

import java.util.List;

import com.mco.wackyguesses.entities.jupiter.asteroid.EntityAsteroid;
import com.mco.wackyguesses.util.BaseBossMob;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityJupiter extends BaseBossMob implements IRangedAttackMob{

    private int attackTime;
    public int deathTicks;

    public EntityJupiter(World p_i1738_1_) {
        super(p_i1738_1_);
        this.attackTime = 30;
        this.setSize(3.0F, 3.8F);
        this.isImmuneToFire = true;
        this.experienceValue = 200;
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 32, true));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(175.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0D);
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.getHealth() <= this.getMaxHealth() && this.getHealth() >= this.getMaxHealth() * 2.0F / 3.0F) {
            this.attackTime = 20;
        } else if (this.getHealth() < this.getMaxHealth() * 2.0F / 3.0F && this.getHealth() >= this.getMaxHealth() * 1.0F / 3.0F) {
            this.attackTime = 10;
        } else {
            this.attackTime = 5;
        }

        if (this.getAttackTarget() != null && this.getEntityToAttack() != null && !this.worldObj.isRemote && this.deathTime == 0) {
            if (this.attackTime == 20 && this.ticksExisted % 30 == 0) {
                this.launchAsteroidToEntity(0, this.getAttackTarget());
            } else if (this.attackTime == 10 && this.ticksExisted % 20 == 0) {
                this.launchAsteroidToEntity(0, this.getAttackTarget());
            } else if (this.attackTime == 5 && this.ticksExisted % 10 == 0) {
                this.launchAsteroidToEntity(0, this.getAttackTarget());
            }
        }

        if (this.getAttackTarget() == null && this.getEntityToAttack() != null) {
            List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
            for (EntityPlayer entity : list) {
                if (entity != null && !entity.capabilities.isCreativeMode) {
                    this.setAttackTarget(entity);
                }
            }
        }

    }


    private void launchAsteroidToEntity(int p_82216_1_, EntityLivingBase p_82216_2_) {
        this.launchAsteroidToCoords(p_82216_1_, p_82216_2_.posX, p_82216_2_.posY + p_82216_2_.getEyeHeight() * 0.5D, p_82216_2_.posZ);
    }

    private void launchAsteroidToCoords(int p_82209_1_, double x, double y, double z) {
        // TODO: WHAT DOES THAT DO?
        // this.worldObj.playEvent((EntityPlayer)null, 1024, new BlockPos(this), 0);
        double d0 = this.posX;
        double d1 = this.posY + 2.0D;
        double d2 = this.posZ;
        double d3 = x - d0;
        double d4 = y - d1;
        double d5 = z - d2;
        EntityAsteroid entityAsteroid = new EntityAsteroid(this.worldObj, this, d3, d4, d5);
        entityAsteroid.posY = d1;
        entityAsteroid.posX = d0;
        entityAsteroid.posZ = d2;
        this.worldObj.spawnEntityInWorld(entityAsteroid);
    }


    private void launchAsteroidRain() {
        this.rainAsteroids(this.posX + this.rand.nextInt(30) - 15.0D, this.posY, this.posZ + this.rand.nextInt(30) - 15.0D);
    }


    private void rainAsteroids(double x, double y, double z) {
        int i = 0;
        if (this.rand.nextInt(2) == 0) {
            i = -1;
        }

        if (this.rand.nextInt(2) == 1) {
            i = 1;
        }

        double d0 = this.posX + this.rand.nextInt(30) * i;
        double d1 = this.posY + 100.0D;
        double d2 = this.posZ + this.rand.nextInt(30) * i;
        double d3 = x - d0;
        double d4 = y - d1;
        double d5 = z - d2;
        EntityAsteroid entityAsteroid = new EntityAsteroid(this.worldObj, this, d3 * 150.0D, d4 * 150.0D, d5 * 150.0D);
        entityAsteroid.posY = d1;
        entityAsteroid.posX = d0;
        entityAsteroid.posZ = d2;
        this.worldObj.spawnEntityInWorld(entityAsteroid);
    }





    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float dist)
    {
        if (target != null) {
            this.launchAsteroidToEntity(0, target);
        }
    }

    @Override
    protected void onDeathUpdate() {
        ++this.deathTicks;
        if (this.deathTicks <= 130) {
            this.launchAsteroidRain();
        }

        if (this.deathTicks > 60) {
            float f = (this.rand.nextFloat() - 0.5F) * 8.0F;
            float f1 = (this.rand.nextFloat() - 0.5F) * 4.0F;
            float f2 = (this.rand.nextFloat() - 0.5F) * 8.0F;
            //   this.worldObj.spawnParticle("hugeexplosion", this.explosionX, this.explosionY, this.explosionZ, 1.0D, 0.0D, 0.0D);
            this.worldObj.spawnParticle("hugeexplosion", this.posX + f, this.posY + 2.0D + f1, this.posZ + f2, 0.0D, 0.0D, 0.0D);
        }
        this.moveEntity(0.0D, 0.10000000149011612D, 0.0D);

        //  this.move(MoverType.SELF, 0.0D, 0.10000000149011612D, 0.0D);
        this.rotationYaw += 20.0F;
        this.renderYawOffset = this.rotationYaw;
        if (this.deathTicks == 200 && !this.worldObj.isRemote) {
            this.setDead();
        }

    }

}

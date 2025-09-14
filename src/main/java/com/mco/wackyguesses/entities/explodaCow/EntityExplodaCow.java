package com.mco.wackyguesses.entities.explodaCow;

import java.util.List;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityExplodaCow extends EntityMob
{

    private int explosionRadius = 3;

    public EntityExplodaCow(World p_i1738_1_)
    {
        super(p_i1738_1_);
        this.setSize(0.9F, 1.4F);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, false));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 32, true));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.45D);
    }

    @Override
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
        if (p_70097_1_.isExplosion())
            return false;
        else
            return super.attackEntityFrom(p_70097_1_, p_70097_2_);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }



    @Override
    public void onUpdate() {

        if (this.isEntityAlive() && this.ticksExisted % 50 == 0 && this.getEntityToAttack() != null)
        {
            this.explode();
        }

        super.onUpdate();
    }

    private void explode() {
        if (!this.worldObj.isRemote) {
            boolean flag = this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing");
            float f = 1.0F;
            this.dead = true;
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, this.explosionRadius * f, flag);
            // TODO: add effects
            //this.spawnLingeringCloud();
        }

    }




}

package com.mco.wackyguesses.entities.bananaBoss.bananaSmall;

import com.mco.wackyguesses.util.BasicAgressiveAttackingEntity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBananaMinion extends BasicAgressiveAttackingEntity
{

    public EntityBananaMinion(World p_i1738_1_) {
        super(p_i1738_1_);
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.4);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10);
    }

    @Override
    public int getTotalArmorValue() {
        return 0;
    }

}

package com.mco.wackyguesses.entities.wheelbarrow;

import java.util.List;

import com.mco.wackyguesses.source.WackyDamages;
import com.mco.wackyguesses.util.BasicAgressiveAttackingEntity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWheelbarrow extends BasicAgressiveAttackingEntity
{

    public EntityWheelbarrow(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(2.0F, 1.3F);
        this.experienceValue = 40;
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75.0D);
    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public void onCollideWithPlayer(EntityPlayer entityIn)
    {
        if (entityIn != null) {
            entityIn.attackEntityFrom(WackyDamages.WBARROW, 4.0F);
            entityIn.knockBack(entityIn, 1.0F, MathHelper.sin(this.rotationYaw * 0.017453292F), (-MathHelper.cos(this.rotationYaw * 0.017453292F)));
        }
    }

}

package com.mco.wackyguesses.entities.chocolate.sphere;

import java.util.Random;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.util.BasicAgressiveAttackingEntity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySphericalChoco extends BasicAgressiveAttackingEntity
{
    private int textureInt;

    public EntitySphericalChoco(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(1F, 1F);
        this.experienceValue = 10;
        Random rand = new Random();
        this.textureInt = rand.nextInt(4);
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(7);
        //    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64D);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
        nbt.setInteger(Wacky.MODID+"SphereChocoTextureID", this.textureInt);
    }
    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
        nbt.getInteger(Wacky.MODID+"SphereChocoTextureID");

    }

    @Override
    public float getEyeHeight() {
        return 1.0F;

    }

    public int getTextureInt()
    {
        return this.textureInt;
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
    }

}

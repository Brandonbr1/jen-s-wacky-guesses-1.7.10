package com.mco.wackyguesses.entities.chocolate.rectangle;

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

public class EntityRectangularChoco extends BasicAgressiveAttackingEntity
{

    private int textureInt;

    public EntityRectangularChoco(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(1F, 2F);
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

        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(.2);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbt)
    {
        super.writeEntityToNBT(nbt);
        nbt.setInteger(Wacky.MODID+"RectChocoTextureID", this.textureInt);
    }
    @Override
    public void readEntityFromNBT(NBTTagCompound nbt)
    {
        super.readEntityFromNBT(nbt);
        nbt.getInteger(Wacky.MODID+"RectChocoTextureID");

    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
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

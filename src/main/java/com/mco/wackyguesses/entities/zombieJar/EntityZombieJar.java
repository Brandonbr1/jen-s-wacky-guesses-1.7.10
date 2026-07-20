package com.mco.wackyguesses.entities.zombieJar;

import java.util.Iterator;
import java.util.List;

import net.minecraft.client.audio.SoundCategory;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityZombieJar extends EntityMob implements IBossDisplayData
{

    public EntityZombieJar(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(4.0F, 3.7F);
        this.experienceValue = 100;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
    }



    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public int getTotalArmorValue() {
        return 2;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();


        if (this.worldObj.isDaytime())
        {
            this.worldObj.setWorldTime(20000L);
        }

        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D,32.0D));

            for (int i = 0; i < list.size(); i++) {
                EntityPlayer entity = list.get(i);
                if(entity!=null) {
                    this.setAttackTarget(entity);
                }
            }

        }


        if (this.ticksExisted % 50 == 0 && !this.worldObj.isRemote)
        {
            EntityZombie zombro = new EntityZombie(this.worldObj);
            zombro.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(zombro);
            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "mob.horse.zombie.death", 10.0F, 1.0F);
        }
    }


    @Override
    protected String getHurtSound() {
        return "mob.horse.zombie.hit";
     //   return "step.stone";
    }

    @Override
    protected String getDeathSound() {
        return "dig.glass";
    }

    @Override
    protected float getSoundVolume() {
        return 10.0F;
    }


}

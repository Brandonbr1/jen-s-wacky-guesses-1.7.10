package com.mco.wackyguesses.entities.zombieJar;

import java.util.Iterator;
import java.util.List;

import net.minecraft.client.audio.SoundCategory;
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
    protected void entityInit() {
        super.entityInit();
        // let's not brick time set day by constantly setting it to night
        if (this.worldObj.isDaytime())
        {
            this.worldObj.setWorldTime(20000L);
        }
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

        BossStatus.setBossStatus(this, true);

        if(this.getAttackTarget()==null)
        {
            List<EntityPlayer> list = this.worldObj.<EntityPlayer>getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D,32.0D));
            for(EntityPlayer entity : list)
            {
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
            // TODO: ADD SOUNDS
            // this.world.playSound(this.posX, this.posY, this.posZ, SoundEvents.ENTITY_ZOMBIE_HORSE_DEATH, SoundCategory.HOSTILE, 10.0F, 1.0F, false);
        }


    }

    @Override
    protected float getSoundVolume() {
        return 10.0F;
    }


}

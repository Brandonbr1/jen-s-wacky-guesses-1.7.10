package com.mco.wackyguesses.entities.chocolate.box;

import java.util.List;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.entities.base.BaseBossMob;
import com.mco.wackyguesses.entities.chocolate.rectangle.EntityRectangularChoco;
import com.mco.wackyguesses.entities.chocolate.sphere.EntitySphericalChoco;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityChocoBox extends BaseBossMob
{

    public EntityChocoBox(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(4F, .5F);
        this.experienceValue = 100;
    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1);
    }

    @Override
    public int getTotalArmorValue() {
        return 12;
    }


    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
        super.dropFewItems(wasRecentlyHit, lootingModifier);
        dropItem(Wacky.sphericalChoc, this.rand.nextInt(9) + 6);
        dropItem(Wacky.rectChoc, this.rand.nextInt(9) + 6);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        if(this.ticksExisted % 50 == 0 && !this.worldObj.isRemote)
        {
            if(this.rand.nextInt(2) == 1) {
                EntityRectangularChoco entityRectangularChoco = new EntityRectangularChoco(this.worldObj);
                entityRectangularChoco.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(entityRectangularChoco);
            }
            else
            {
                EntitySphericalChoco entitySphericalChoco = new EntitySphericalChoco(this.worldObj);
                entitySphericalChoco.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(entitySphericalChoco);
            }
        }

    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        BossStatus.setBossStatus(this, false);
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

}

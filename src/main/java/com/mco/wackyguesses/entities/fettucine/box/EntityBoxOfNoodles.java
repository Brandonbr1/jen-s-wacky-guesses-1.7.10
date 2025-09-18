package com.mco.wackyguesses.entities.fettucine.box;

import java.util.List;

import com.mco.wackyguesses.entities.fettucine.noodle.EntityFettuccineNoodle;
import com.mco.wackyguesses.entities.fettucine.projectile.EntityNoodleProjectile;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityBoxOfNoodles extends EntityMob
{

    public EntityBoxOfNoodles(World p_i1738_1_) {
        super(p_i1738_1_);
        this.setSize(2.0F, 3.45F);
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));

    }

    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.ticksExisted % 30 == 0 && !this.worldObj.isRemote && this.getAttackTarget() != null)
        {
            if (this.rand.nextInt(2) == 0) {
                EntityFettuccineNoodle noodle = new EntityFettuccineNoodle(this.worldObj);
                noodle.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(noodle);
            } else {
                this.launchNoodleProjectileToEntity(this.getAttackTarget());
            }
        }

    }

    private void launchNoodleProjectileToEntity(EntityLivingBase p_82216_2_) {
        this.launchNoodleProjectileToCoords(p_82216_2_.posX, p_82216_2_.posY + p_82216_2_.getEyeHeight() * 0.5D, p_82216_2_.posZ);
    }

    private void launchNoodleProjectileToCoords(double x, double y, double z) {
        System.out.println("TRY TO SHOOT");
        double d0 = this.posX;
        double d1 = this.posY + 4.0D;
        double d2 = this.posZ;
        double d3 = x - d0;
        double d4 = y - d1;
        double d5 = z - d2;
        EntityNoodleProjectile entityNoodleProjectile = new EntityNoodleProjectile(this.worldObj, this, d3, d4, d5);
        entityNoodleProjectile.posY = d1;
        entityNoodleProjectile.posX = d0;
        entityNoodleProjectile.posZ = d2;
        this.worldObj.spawnEntityInWorld(entityNoodleProjectile);
    }



}

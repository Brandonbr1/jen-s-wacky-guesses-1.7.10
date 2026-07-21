package com.mco.wackyguesses.entities.base;

import com.mco.wackyguesses.Wacky;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class BaseRideable extends EntityLiving{

    public BaseRideable(World p_i1685_1_) {
        super(p_i1685_1_);
        this.setSize(1.4F, 1.6F);
        this.stepHeight = 2.0F;
        this.isImmuneToFire = true;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    public boolean allowLeashing() {
        return false;
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amm) {
        Entity entity = source.getEntity();
        return (this.riddenByEntity == null || !this.riddenByEntity.equals(entity)) && super.attackEntityFrom(source, amm);

    }


    @Override
    public boolean canBePushed() {
        return this.riddenByEntity == null;
    }


    @Override
    protected void fall(float p_70069_1_) {
    }


    @Override
    public boolean getCanSpawnHere() {
        return false;
    }

    @Override
    protected String getDeathSound() {
        return null;

    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
        super.dropFewItems(wasRecentlyHit, lootingModifier);
        dropItem(Wacky.bananaMobile, 1);
    }

    @Override
    protected String getHurtSound() {
        return null;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0F);
    }

    @Override
    public boolean canBeSteered() {
        return true;
    }

    @Override
    public boolean interact(EntityPlayer p_70085_1_) {
        if (this.riddenByEntity == null) {
                this.mount(p_70085_1_);
                return true;
        }
            return super.interact(p_70085_1_);

    }

    private void mount(EntityPlayer player) {
        player.rotationYaw = this.rotationYaw;
        player.rotationPitch = this.rotationPitch;

        if (!this.worldObj.isRemote) {
            player.mountEntity(this);
        }
    }


    @Override
    protected boolean isMovementBlocked() {
        return this.riddenByEntity != null;
    }


    @Override
    public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_) {
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase) {
            this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
            this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5F;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            this.rotationYawHead = this.renderYawOffset = this.rotationYaw;
            p_70612_1_ = ((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5F;
            p_70612_2_ = ((EntityLivingBase)this.riddenByEntity).moveForward;

            if (p_70612_2_ <= 0.0F) {
                p_70612_2_ *= 0.25F;
            }

            /**  if (this.onGround && this.jumpPower == 0.0F && this.isRearing() && !this.field_110294_bI) {
                p_70612_1_ = 0.0F;
                p_70612_2_ = 0.0F;
            }
             **/


            this.stepHeight = 1.0F;
            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;

            if (!this.worldObj.isRemote) {
                this.setAIMoveSpeed((float)this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
                super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
            }


            this.prevLimbSwingAmount = this.limbSwingAmount;
            double d1 = this.posX - this.prevPosX;
            double d0 = this.posZ - this.prevPosZ;
            float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;

            if (f4 > 1.0F) {
                f4 = 1.0F;
            }

            this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
            this.limbSwing += this.limbSwingAmount;
        } else {
            this.stepHeight = 0.5F;
            this.jumpMovementFactor = 0.02F;
            super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
        }
    }


    @Override
    protected boolean isAIEnabled() {
        return true;
    }

    @Override
    public boolean isOnLadder() {
        return false;
    }


}

package com.mco.wackyguesses.entities.cloud;

import java.util.List;
import java.util.Random;

import com.mco.wackyguesses.entities.cloud.ai.AIHover;
import com.mco.wackyguesses.entities.cloud.ai.AIPoof;
import com.mco.wackyguesses.entities.cloud.ai.AIStand;
import com.mco.wackyguesses.util.BaseBossMob;

import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationAI;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityCloud extends BaseBossMob implements IAnimatedEntity{

    private Animation animation;
    private int animationTick;
    public static final Animation ANIMATION_HOVER = Animation.create(60);
    public static final Animation ANIMATION_STAND = Animation.create(40);
    public static final Animation ANIMATION_POOF = Animation.create(10);
    public static final Animation ANIMATION_DEATH = Animation.create(300);
    private static final Animation[] ANIMATIONS;
    public AnimationAI<EntityCloud> currentAnim;


    public EntityCloud(World p_i1738_1_) {
        super(p_i1738_1_);
        this.animation = NO_ANIMATION;
        this.setSize(1.3F, 1.5F);
        this.experienceValue = 200;
        this.isImmuneToFire = true;
        this.tasks.addTask(0, new AIHover(this, ANIMATION_HOVER));
        this.tasks.addTask(0, new AIStand(this, ANIMATION_STAND));
        this.tasks.addTask(0, new AIPoof(this, ANIMATION_POOF));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));

    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.35D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
    }

    @Override
    public int getTotalArmorValue() {
        return 2;
    }

    @Override
    public int getAnimationTick() {
        // TODO Auto-generated method stub
        return this.animationTick;
    }

    @Override
    public void setAnimationTick(int tick) {
        this.animationTick = tick;

    }

    @Override
    public Animation getAnimation() {
        // TODO Auto-generated method stub
        return this.animation;
    }

    @Override
    public void setAnimation(Animation animation) {
        if (animation == NO_ANIMATION) {
            this.onAnimationFinish(this.animation);
            this.setAnimationTick(0);
        }

        this.animation = animation;

    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.getAttackTarget() == null) {
            List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.boundingBox.expand(32.0D, 32.0D, 32.0D));
            for (EntityPlayer entity : list) {
                if (entity != null && !entity.capabilities.isCreativeMode) {
                    this.setAttackTarget(entity);
                }
            }
        }

        if (this.getAnimation() != NO_ANIMATION) {
            ++this.animationTick;
            if (this.worldObj.isRemote && this.animationTick >= this.animation.getDuration()) {
                this.setAnimation(NO_ANIMATION);
            }
        }

        if (this.getAttackTarget() != null && this.currentAnim == null && this.getAnimation() == NO_ANIMATION && this.getAnimation() != ANIMATION_DEATH) {
            switch((new Random()).nextInt(4)) {
                case 0:
                    AnimationHandler.INSTANCE.sendAnimationMessage(this, ANIMATION_HOVER);
                    System.out.println("HOVER");
                    break;
                case 1:
                    AnimationHandler.INSTANCE.sendAnimationMessage(this, ANIMATION_STAND);
                    System.out.println("STAND");
                    break;
                case 2:
                    AnimationHandler.INSTANCE.sendAnimationMessage(this, ANIMATION_POOF);
                    System.out.println("POOF");
            }
        }

        if (this.getAnimation() == ANIMATION_HOVER) {
            this.motionX = this.motionZ = 0.0D;
        }

        if (this.getAnimation() == ANIMATION_HOVER && this.getAnimationTick() < 35) {
            for(int i = 0; i < 20; ++i) {
                // TODO: ANIMATIONS
                //   this.world.spawnParticle(EnumParticleTypes.CLOUD, this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.getAnimationTick() / 7.5D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }

    }

    public boolean teleportTo(double p_70825_1_, double p_70825_3_, double p_70825_5_) {
        EnderTeleportEvent event = new EnderTeleportEvent(this, p_70825_1_, p_70825_3_, p_70825_5_, 0);
        if (MinecraftForge.EVENT_BUS.post(event))
            return false;
        double d3 = this.posX;
        double d4 = this.posY;
        double d5 = this.posZ;
        this.posX = event.targetX;
        this.posY = event.targetY;
        this.posZ = event.targetZ;
        boolean flag = false;
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);

        if (this.worldObj.blockExists(i, j, k)) {
            boolean flag1 = false;

            while (!flag1 && j > 0) {
                Block block = this.worldObj.getBlock(i, j - 1, k);

                if (block.getMaterial().blocksMovement()) {
                    flag1 = true;
                } else {
                    --this.posY;
                    --j;
                }
            }

            if (flag1) {
                this.setPosition(this.posX, this.posY, this.posZ);

                if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox)) {
                    flag = true;
                }
            }
        }

        if (!flag) {
            this.setPosition(d3, d4, d5);
            return false;
        } else {
            short short1 = 128;

            for (int l = 0; l < short1; ++l) {
                double d6 = l / (short1 - 1.0D);
                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
                double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
                double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
                this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
            }

            this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
            this.playSound("mob.endermen.portal", 1.0F, 1.0F);
            return true;
        }
    }


    protected void onAnimationFinish(Animation animation) {
    }

    @Override
    public Animation[] getAnimations() {
        // TODO Auto-generated method stub
        return ANIMATIONS;
    }


    static {
        ANIMATIONS = new Animation[]{ANIMATION_HOVER, ANIMATION_STAND, ANIMATION_POOF, ANIMATION_DEATH};
    }

}

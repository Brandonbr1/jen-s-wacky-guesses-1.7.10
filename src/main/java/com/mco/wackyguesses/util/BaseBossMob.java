package com.mco.wackyguesses.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class BaseBossMob extends EntityMob implements IBossDisplayData, IRangedAttackMob
{

    public BaseBossMob(World p_i1738_1_) {
        super(p_i1738_1_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_)
    {
        // TODO Auto-generated method stub

    }

}

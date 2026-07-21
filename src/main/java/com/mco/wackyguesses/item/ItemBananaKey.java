package com.mco.wackyguesses.item;

import com.mco.wackyguesses.entities.base.BaseRideable;
import com.mco.wackyguesses.source.WackyDamages;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ItemBananaKey extends Item {

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (target instanceof BaseRideable) {
            if (attacker instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) attacker;
                target.attackEntityFrom(DamageSource.causePlayerDamage(player), 1000);
                return true;
            }

            return true;
        }
        return super.hitEntity(stack, target, attacker);
    }



}

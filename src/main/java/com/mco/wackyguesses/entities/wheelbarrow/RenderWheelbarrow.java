package com.mco.wackyguesses.entities.wheelbarrow;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderWheelbarrow extends RenderLiving
{

    public RenderWheelbarrow() {
        super(new ModelWheelbarrow(), 1.0f);
    }

    private static final String MOB_TEXTURE = ":textures/entities/wheelbarrow.png";

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        // TODO Auto-generated method stub
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

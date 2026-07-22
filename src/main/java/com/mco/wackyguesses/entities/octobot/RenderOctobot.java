package com.mco.wackyguesses.entities.octobot;

import org.lwjgl.opengl.GL11;

import com.mco.wackyguesses.Wacky;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;


@SideOnly(Side.CLIENT)
public class RenderOctobot extends RenderLiving
{

    private static final String MOB_TEXTURE = ":textures/entities/octobot.png";
    private static final ResourceLocation octobotTextures = new ResourceLocation("wackyguesses:textures/entities/tractor_beam.png");

    final ModelOctobotLaser modelmatter = new ModelOctobotLaser();

    public RenderOctobot() {
        super(new ModelOctobot(), 0.7f);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entityLiving, float partialTickTime)
    {
        GL11.glScalef(2F, 2F, 2F);
    }

    @Override
    protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_)
    {
        return this.shouldRenderPass((EntityOctobot)p_77032_1_, p_77032_2_, p_77032_3_);
    }

    protected int shouldRenderPass(EntityOctobot mob, int pass, float timer)
    {
          GL11.glDepthMask(true);

        if (pass == 1 || pass == 2)
        {
            float xOffset = (pass == 1) ? 0.35F : -0.35F;
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS );
            GL11.glPushMatrix();

            float f = (float)mob.ticksExisted + timer;

            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(0.4F, 6.0F, 0.4F);
            GL11.glTranslatef(xOffset, 0.1F, -0.7F);

            this.bindTexture(octobotTextures);

            GL11.glMatrixMode(GL11.GL_TEXTURE);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, f * -0.02F, 0.0F);


            GL11.glMatrixMode(GL11.GL_MODELVIEW);

            this.setRenderPassModel(this.mainModel);

            GL11.glEnable(GL11.GL_BLEND);
            float f4 = 0.5F;
            GL11.glColor4f(f4, f4, f4, 1.0F);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

            this.modelmatter.render((Entity)mob, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

            GL11.glMatrixMode(GL11.GL_TEXTURE);
            GL11.glPopMatrix();

            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glPopMatrix();

            GL11.glPopAttrib();

            return pass;
        }

        return -1;
    }


    protected int inheritRenderPass(EntityOctobot p_77035_1_, int p_77035_2_, float p_77035_3_)
    {
        return -1;
    }

    @Override
    protected int inheritRenderPass(EntityLivingBase p_77035_1_, int p_77035_2_, float p_77035_3_) {
        return this.inheritRenderPass((EntityOctobot)p_77035_1_, p_77035_2_, p_77035_3_);
    }



    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return new ResourceLocation(Wacky.MODID + MOB_TEXTURE);
    }

}

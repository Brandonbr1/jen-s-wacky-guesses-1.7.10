package com.mco.wackyguesses.proxy;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.entities.bananamobile.EntityBananamobile;
import com.mco.wackyguesses.entities.bananamobile.RenderBananamobile;
import com.mco.wackyguesses.entities.dorito.EntityDorito;
import com.mco.wackyguesses.entities.dorito.RenderDorito;
import com.mco.wackyguesses.entities.dorito.doritoThrowable.EntityDoritoThrowable;
import com.mco.wackyguesses.entities.egg.EntityEgg;
import com.mco.wackyguesses.entities.egg.RenderEgg;
import com.mco.wackyguesses.entities.floatBeeGunner.EntityFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.RenderFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.EntityBee;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.RenderBee;
import com.mco.wackyguesses.entities.ironPapa.EntityIronPapa;
import com.mco.wackyguesses.entities.ironPapa.RenderIronPapa;
import com.mco.wackyguesses.entities.patHead.EntityPatHead;
import com.mco.wackyguesses.entities.patHead.RenderPatHead;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;

public class ClientProxy extends CommonProxy {

    public ClientProxy() {
        super();
    }

    @Override
    public void registerRenderers()
    {
        this.addRender(EntityPatHead.class, new RenderPatHead());
        this.addRender(EntityEgg.class, new RenderEgg());
        this.addRender(EntityIronPapa.class, new RenderIronPapa());
        this.addRender(EntityDorito.class, new RenderDorito());
        this.addRender(EntityDoritoThrowable.class, new RenderSnowball(Wacky.itemDorito));
        this.addRender(EntityBananamobile.class, new RenderBananamobile());
        this.addRender(EntityFloatBeeGunner.class, new RenderFloatBeeGunner());
        this.addRender(EntityBee.class, new RenderBee());
    }


    private void addRender(Class<? extends Entity > c, Render r)
    {
        RenderingRegistry.registerEntityRenderingHandler(c, r);
    }


}

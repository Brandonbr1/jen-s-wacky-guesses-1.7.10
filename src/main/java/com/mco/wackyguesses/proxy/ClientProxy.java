package com.mco.wackyguesses.proxy;

import com.mco.wackyguesses.Wacky;
import com.mco.wackyguesses.entities.angelicSpider.EntityAngelicSpider;
import com.mco.wackyguesses.entities.angelicSpider.RenderAngelicSpider;
import com.mco.wackyguesses.entities.bananaBoss.EntityBanana;
import com.mco.wackyguesses.entities.bananaBoss.RenderBanana;
import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.EntityBananaMinion;
import com.mco.wackyguesses.entities.bananaBoss.bananaSmall.RenderBananaMinion;
import com.mco.wackyguesses.entities.bananaBoss.bananaThrowable.EntityBananaThrowable;
import com.mco.wackyguesses.entities.bananamobile.EntityBananamobile;
import com.mco.wackyguesses.entities.bananamobile.RenderBananamobile;
import com.mco.wackyguesses.entities.chocolate.box.EntityChocoBox;
import com.mco.wackyguesses.entities.chocolate.box.RenderChocoBox;
import com.mco.wackyguesses.entities.chocolate.rectangle.EntityRectangularChoco;
import com.mco.wackyguesses.entities.chocolate.rectangle.RenderRectangularChoco;
import com.mco.wackyguesses.entities.chocolate.sphere.EntitySphericalChoco;
import com.mco.wackyguesses.entities.chocolate.sphere.RenderSphericalChoco;
import com.mco.wackyguesses.entities.dorito.EntityDorito;
import com.mco.wackyguesses.entities.dorito.RenderDorito;
import com.mco.wackyguesses.entities.dorito.doritoThrowable.EntityDoritoThrowable;
import com.mco.wackyguesses.entities.egg.EntityEgg;
import com.mco.wackyguesses.entities.egg.RenderEgg;
import com.mco.wackyguesses.entities.explodaCow.EntityExplodaCow;
import com.mco.wackyguesses.entities.explodaCow.RenderExplodaCow;
import com.mco.wackyguesses.entities.floatBeeGunner.EntityFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.RenderFloatBeeGunner;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.EntityBee;
import com.mco.wackyguesses.entities.floatBeeGunner.bee.RenderBee;
import com.mco.wackyguesses.entities.floatBeeGunner.bullet.EntityBullet;
import com.mco.wackyguesses.entities.ironPapa.EntityIronPapa;
import com.mco.wackyguesses.entities.ironPapa.RenderIronPapa;
import com.mco.wackyguesses.entities.octobot.EntityOctobot;
import com.mco.wackyguesses.entities.octobot.RenderOctobot;
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
        this.addRender(EntityBananamobile.class, new RenderBananamobile());
        this.addRender(EntityFloatBeeGunner.class, new RenderFloatBeeGunner());
        this.addRender(EntityBee.class, new RenderBee());

        this.addRender(EntityBanana.class, new RenderBanana());
        this.addRender(EntityBananaMinion.class, new RenderBananaMinion());
        this.addRender(EntityAngelicSpider.class, new RenderAngelicSpider());

        this.addRender(EntityOctobot.class, new RenderOctobot());


        // choco variants
        this.addRender(EntitySphericalChoco.class, new RenderSphericalChoco());
        this.addRender(EntityRectangularChoco.class, new RenderRectangularChoco());
        this.addRender(EntityChocoBox.class, new RenderChocoBox());

        this.addRender(EntityExplodaCow.class, new RenderExplodaCow());


        this.addRender(EntityDoritoThrowable.class, new RenderSnowball(Wacky.itemDorito));
        this.addRender(EntityBananaThrowable.class, new RenderSnowball(Wacky.itemBanana));
        this.addRender(EntityBullet.class, new RenderSnowball(Wacky.itemBullet));
    }


    private void addRender(Class<? extends Entity > c, Render r)
    {
        RenderingRegistry.registerEntityRenderingHandler(c, r);
    }




}

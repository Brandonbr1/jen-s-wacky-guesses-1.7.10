package com.mco.wackyguesses.proxy;

import com.mco.wackyguesses.entities.explodaCow.EntityExplodaCow;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class CommonProxy {


    public void registerRenderers() {
        // NO-OP
    }

    public void spawnFXExplodaCow(World world, double x, double y, double z)
    {

    }

    private void addRender(Class<? extends Entity > clazz, Render render)
    {
        return;
    }


}

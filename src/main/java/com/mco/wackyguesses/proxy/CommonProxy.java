package com.mco.wackyguesses.proxy;

import com.mco.wackyguesses.entities.explodaCow.EntityExplodaCow;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public class CommonProxy {

    public CommonProxy() {
        // NO-OP
    }

    public void registerRenderers() {
        // NO-OP
    }

    private void addRender(Class<? extends Entity > clazz, Render render)
    {
        return;
    }


}

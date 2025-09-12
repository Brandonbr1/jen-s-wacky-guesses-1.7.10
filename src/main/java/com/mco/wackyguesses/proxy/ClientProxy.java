package com.mco.wackyguesses.proxy;

import com.mco.wackyguesses.entities.patHead.EntityPatHead;
import com.mco.wackyguesses.entities.patHead.RenderPatHead;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public ClientProxy() {
        super();
    }

    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityPatHead.class, new RenderPatHead());
    }


}

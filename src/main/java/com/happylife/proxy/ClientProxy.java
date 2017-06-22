package com.happylife.proxy;

import com.happylife.HappyLife;
import com.happylife.events.PlayerEvents;
import cpw.mods.fml.common.FMLCommonHandler;

/**
 * Created by WLH on 2015/7/18.
 */
public class ClientProxy extends CommonProxy
{
    public void preInit()
    {
        super.preInit();
        FMLCommonHandler.instance().bus().register(new PlayerEvents());
    }
    public void init()
    {
        //super.init();
        HappyLife.LOGGER.info("ClientProxy");
    }
}

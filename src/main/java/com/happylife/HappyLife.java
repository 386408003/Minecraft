package com.happylife;

import com.happylife.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = HappyLife.MODID, version = HappyLife.VERSION , name = HappyLife.MODNAME)
public class HappyLife
{
    public static final String MODID = "happylife";
    public static final String VERSION = "0.1";
    public static final String MODNAME="Happy Life";
    public static final Logger LOGGER =LogManager.getLogger("HappyLife");
    @SidedProxy(clientSide = "com.happylife.proxy.ClientProxy",serverSide = "com.happylife.proxy.CommonProxy")
    public static CommonProxy commonProxy;

    public static CreativeTabs HappyLifeTabs=new CreativeTabs("HappyLifeTabs") {
        @Override
        public Item getTabIconItem() {
            return Items.egg;
        }
		
    };
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        commonProxy.preInit();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        commonProxy.init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LOGGER.info("The Happy Life Mod has been loaded!");
    }
}

package com.happylife.items;

import com.happylife.HappyLife;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
/**
 * Created by WLH on 2015/7/19.
 */
public class HappyLifeItems {
    public static Item kinkora;
    public static Item goldenEgg;
    public static void initItems()
    {
    	////自带Item金克拉
        kinkora=new Kinkora().setCreativeTab(HappyLife.HappyLifeTabs).setUnlocalizedName("Kinkora").setTextureName(HappyLife.MODID+":kinkora");
        GameRegistry.registerItem(kinkora, kinkora.getUnlocalizedName());
        //System.out.println();
        
        //第一个Item金蛋
        goldenEgg = new GoldenEgg().setCreativeTab(HappyLife.HappyLifeTabs).setTextureName(HappyLife.MODID+":goldenEgg");
        GameRegistry.registerItem(goldenEgg, goldenEgg.getUnlocalizedName());
    }
}

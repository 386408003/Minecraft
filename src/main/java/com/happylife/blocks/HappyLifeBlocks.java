package com.happylife.blocks;

import com.happylife.HappyLife;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import com.happylife.blocks.BacteriaBlock;
/**
 * Created by WLH on 2015/7/19.
 */
public class HappyLifeBlocks {
	public static Block bacteriaBlock;
	public static Block blockGrass;
    public static void initBlock()
    {
    	//自带方块细菌
        bacteriaBlock=new BacteriaBlock().setBlockName("Bacteria").setBlockTextureName(HappyLife.MODID+":bacteria").setCreativeTab(HappyLife.HappyLifeTabs);
        GameRegistry.registerBlock(bacteriaBlock,bacteriaBlock.getUnlocalizedName());
        
        //第一个方块草方块
        blockGrass=new BlockGrass().setBlockName("blockGrass").setBlockTextureName(HappyLife.MODID+":blockGrass").setCreativeTab(HappyLife.HappyLifeTabs);
        GameRegistry.registerBlock(blockGrass,blockGrass.getUnlocalizedName());
    }
}

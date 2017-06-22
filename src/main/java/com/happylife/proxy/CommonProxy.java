package com.happylife.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.happylife.HappyLife;
import com.happylife.blocks.ArticleStacks;
import com.happylife.blocks.HappyLifeBlocks;
import com.happylife.items.HappyLifeItems;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by WLH on 2015/7/18.
 */
public class CommonProxy {
    public void preInit()
    {
    	//HappyLifeRecipe.initBlock();
    	/*GameRegistry.addSmelting(HappyLifeBlocks.blockGrass, new ItemStack(Items.coal), 0.5F);
    	GameRegistry.addShapedRecipe(new ItemStack(HappyLifeItems.goldenEgg,1), new Object[]
    	        {
    	                "###", "#*#", "###", '#', Items.gold_ingot, '*', Items.egg
    	        });
    	GameRegistry.addShapedRecipe(new ItemStack(HappyLifeBlocks.blockGrass,1), new Object[]
    	        {
    	                "##", "##", '#', Blocks.vine
    	        });*/
    	GameRegistry.addShapelessRecipe(ArticleStacks.DIAMOND_STACK_1, ArticleStacks.DIRT_STACK_1,ArticleStacks.SAND_STACK_1);
    	GameRegistry.addShapedRecipe(ArticleStacks.DIAMOND_STACK_1,
                "A B",
                "A B",
                "   ",
                'A',ArticleStacks.DIRT_STACK_1,
                'B',ArticleStacks.SAND_STACK_1);
    	GameRegistry.addShapedRecipe(ArticleStacks.DIAMOND_BLOCK_1,
    			"#  ",
    			"   ",
    			"   ",
                '#',ArticleStacks.DIRT_STACK_1);
    	GameRegistry.addShapedRecipe(ArticleStacks.DIAMOND_BLOCK_64,
    			"#  ",
    			"   ",
    			"   ",
                '#',ArticleStacks.SAND_STACK_1);
    	
    	GameRegistry.addShapedRecipe(ArticleStacks.DIRT_STACK_1,
    			"# #",
    			"   ",
    			" # ",
                '#',ArticleStacks.WOOL_BLACK_1);
    	GameRegistry.addShapedRecipe(ArticleStacks.DIAMOND_BLOCK_64,
    			"c  ",
    			"b  ",
    			"   ",
    			'c',ArticleStacks.WOOL_BLACK_1,
                'b',ArticleStacks.WOOL_ORANGE_1);
    	GameRegistry.addSmelting(ArticleStacks.DIRT_STACK_1, ArticleStacks.DIAMOND_STACK_1, 100F);
        HappyLifeBlocks.initBlock();
        HappyLifeItems.initItems();
    }
    public void init()
    {
        HappyLife.LOGGER.info("CommonProxy");
    }
}

package com.happylife.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by WLH on 2015/7/19.
 */
public class BacteriaBlock extends Block {
    protected BacteriaBlock() {
        super(Material.rock);
    }

    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
        for (int i=y;i<256;i++)
        {
            world.setBlock(x,i,z,HappyLifeBlocks.bacteriaBlock);
        }

        return side;
    }
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metedata) {
        for (int i=y+1;i<256;i++)
        {
            if (world.getBlock(x,i,z)==HappyLifeBlocks.bacteriaBlock)
            {
                world.setBlock(x,i,z, Blocks.air);
            }else
            {
                break;
            }
        }
    }
}

package com.happylife.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGrass extends Block {

	public BlockGrass() {
		super(Material.ground);
		this.setHardness(0.5f);
		this.setStepSound(soundTypeGrass);
	}

}

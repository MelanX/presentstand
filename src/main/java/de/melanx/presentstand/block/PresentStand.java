package de.melanx.presentstand.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class PresentStand extends BlockBase {
	
	private String oreName;

	public PresentStand(String name) {
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}

	@Override
	public PresentStand setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}

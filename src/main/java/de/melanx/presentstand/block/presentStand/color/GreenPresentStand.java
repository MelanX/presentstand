package de.melanx.presentstand.block.presentStand.color;

import de.melanx.presentstand.block.presentStand.PresentStandBase;
import net.minecraftforge.oredict.OreDictionary;

public class GreenPresentStand extends PresentStandBase {

	public GreenPresentStand() {
		super("green_present_stand");
	}

	public void initOreDict() {
		OreDictionary.registerOre("blockPresentStand", this);
	}

}
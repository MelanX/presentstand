package de.melanx.presentstand.block.presentStand.color;

import de.melanx.presentstand.block.presentStand.PresentStandBase;
import net.minecraftforge.oredict.OreDictionary;

public class BluePresentStand extends PresentStandBase {

	public BluePresentStand() {
		super("blue_present_stand");
	}

	public void initOreDict() {
		OreDictionary.registerOre("blockPresentStand", this);
	}

}
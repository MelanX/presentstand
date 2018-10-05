package de.melanx.presentstand.block.presentStand.color;

import de.melanx.presentstand.block.presentStand.PresentStandBase;
import net.minecraftforge.oredict.OreDictionary;

public class LightGrayPresentStand extends PresentStandBase {

	public LightGrayPresentStand() {
		super("light_gray_present_stand");
	}

	public void initOreDict() {
		OreDictionary.registerOre("blockPresentStand", this);
	}

}
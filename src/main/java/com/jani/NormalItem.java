package com.jani;

public class NormalItem extends AbstractItem {

    public NormalItem(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}
    
	public void updateQuality(){
		if (this.quality > 0)
		{
			this.quality -= 1;
		}

		this.sellIn -=1;

		if (this.sellIn < 0 && this.quality > 0) {
			this.quality -= 1;
		}
	}
}

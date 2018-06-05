package com.jani;

public class AgedItem extends AbstractItem {

    public AgedItem(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);;
    }

    public void updateQuality() {
        if (this.quality < 50) {
            this.quality += 1;
        }
        this.sellIn -=1;

        if (this.sellIn < 0 && this.quality < 50){
            this.quality ++;
        }
    }
}

package com.jani;

public class SulfurasItem extends AbstractItem {

    public SulfurasItem(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    @Override
    public void updateQuality(){
        return;
    }
}

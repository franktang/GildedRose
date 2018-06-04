package com.jani;

public class SulfurasItem implements Item {
    public String name;
    public int sellIn;
    public int quality;

    public SulfurasItem(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    /* Generated getter and setter code */
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getSellIn() {
        return sellIn;
    }
    @Override
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
    @Override
    public int getQuality() {
        return quality;
    }
    @Override
    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public void updateQuality(){
        return;
    }
}

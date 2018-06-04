package com.jani;

public class BackstageItem implements Item {

    public String name;
    public int sellIn;
    public int quality;

    public BackstageItem(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);;
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
    public void updateQuality() {
        if (this.getQuality() < 50)
        {
            this.setQuality(this.getQuality() + 1);


            if (this.getSellIn() < 11)
            {
                if (this.getQuality() < 50)
                {
                    this.setQuality(this.getQuality() + 1);
                }
            }

            if (this.getSellIn() < 6)
            {
                if (this.getQuality() < 50)
                {
                    this.setQuality(this.getQuality() + 1);
                }
            }

        }

        this.setSellIn(this.getSellIn()-1);

        if (this.getSellIn() < 0)
        {
            this.setQuality(this.getQuality() - this.getQuality());
        }

    }
}



package com.jani;

public class BackstageItem extends AbstractItem {

    public BackstageItem(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);;
    }

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



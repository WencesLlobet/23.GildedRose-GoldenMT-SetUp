package com.gildedrose.items;

import com.gildedrose.items.sellin.Sellin;

public abstract class Item {

    protected String name;
    protected Sellin sellInReal;
    protected int quality;
    protected  Quality qualityReal;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellInReal = Sellin.createSellin(sellIn);
        this.quality = quality;
        this.qualityReal = new Quality(quality);
    }

   @Override
   public String toString() {
        return getName() + ", " + getSellIn() + ", " + getQuality();
    }

    public abstract void updateQuality();

    protected boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }

    protected boolean hasNotOutstandingQuality() {
        return qualityReal.isNotOustandingQuality();
    }

    protected void decreaseQualityByOneWithFloor(){
        if(quality > 0){
            decreaseQualityByOne();
        }
    }

    protected void increaseQualityByOne()
    {
        qualityReal.incraseByOne();
        quality = quality + 1;
    }


    protected void incrementQualityBy(Integer increase) {
        quality = getQuality() + increase;
    }

    public abstract void updateSellin();

    protected void decreaseQualityByOne() {
        qualityReal.decreaseQualityByOne();
        quality--;
    }

    protected boolean isSellinUnderZero() {
        return sellInReal.isSellInunderZero();
    }

    protected void decreaseSellinByOne() {
        sellInReal.decreaseByOne();
    }


    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellInReal.getSellin();
    }
}

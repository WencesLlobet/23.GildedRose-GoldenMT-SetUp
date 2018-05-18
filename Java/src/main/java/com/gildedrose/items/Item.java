package com.gildedrose.items;

import com.gildedrose.sellin.Sellin;

public abstract class Item {

    protected static final int OUTSTANDING_QUALITY = 50;
    protected String name;
    protected Sellin sellInReal;
    protected int quality;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellInReal = Sellin.createSellin(sellIn);
        this.quality = quality;
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
        return quality < OUTSTANDING_QUALITY;
    }

    protected void decreaseQualityByOneWithFloor(){
        if(quality > 0){
            decreaseQualityByOne();
        }
    }

    public abstract void updateSellin();

    protected void decreaseQualityByOne() {
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

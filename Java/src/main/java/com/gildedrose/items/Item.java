package com.gildedrose.items;

import com.gildedrose.items.sellin.Sellin;

public abstract class Item {

    protected String name;
    protected Sellin sellInReal;
    protected Quality qualityReal;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellInReal = Sellin.createSellin(sellIn);
        this.qualityReal = new Quality(quality);
    }

   @Override
   public String toString() {
        return getName() + ", " + getSellIn() + ", " + getQuality();
    }

    public abstract void updateQuality();

    protected void incrementQualityBy(Integer increase) {
        qualityReal.incrementQualityBy(increase);
    }

    public int getQuality() {
        return qualityReal.getQuality();
    }

    protected void decreaseQualityByOne() {
        qualityReal.decreaseQualityByOne();
    }









    public abstract void updateSellin();

    protected boolean isSellinUnderZero() {
        return sellInReal.isSellInunderZero();
    }

    protected void decreaseSellinByOne() {
        sellInReal.decreaseByOne();
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellInReal.getSellin();
    }
}

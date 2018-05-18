package com.gildedrose.items;

import com.gildedrose.items.sellin.Sellin;

public abstract class Item {

    private String name;
    Sellin sellInReal;
    Quality qualityReal;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellInReal = Sellin.createSellin(sellIn);
        this.qualityReal = new Quality(quality);
    }

    public abstract void updateQuality();

    public abstract void updateSellin();



    @Override
    public String toString() {
        return getName() + ", " + getSellIn() + ", " + getQuality();
    }

    private String getName() {
        return name;
    }

    public int getQuality() {
        return qualityReal.getQuality();
    }

    private int getSellIn() {
        return sellInReal.getSellin();
    }
}

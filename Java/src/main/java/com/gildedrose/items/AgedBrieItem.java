package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
        if (isSellinUnderZero() && quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

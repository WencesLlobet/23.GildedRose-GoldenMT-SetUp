package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (hasNotOutstandingQuality()) {
            increaseQualityByOne();
        }
        if (isSellinUnderZero() && hasNotOutstandingQuality()) {
            increaseQualityByOne();
        }
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

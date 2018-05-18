package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (qualityReal.isNotOustandingQuality()) {
            increaseQualityByOne();
        }
        if (isSellinUnderZero() && qualityReal.isNotOustandingQuality()) {
            increaseQualityByOne();
        }
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

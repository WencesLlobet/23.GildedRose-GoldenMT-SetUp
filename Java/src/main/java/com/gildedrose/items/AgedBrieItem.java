package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (qualityReal.isNotOustanding()) {
            increaseQualityByOne();
        }
        if (isSellinUnderZero() && qualityReal.isNotOustanding()) {
            increaseQualityByOne();
        }
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

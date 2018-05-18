package com.gildedrose.items;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (qualityReal.isNotOustanding()) {
            qualityReal.incraseByOne();
        }
        if (isSellinUnderZero() && qualityReal.isNotOustanding()) {
            qualityReal.incraseByOne();
        }
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

package com.gildedrose.items;

public class OtherItem extends Item{
    public OtherItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    @Override
    public void updateQuality() {
        qualityReal.decreaseQualityByOneWithFloor();
        if (sellInReal.isSellInunderZero()) {
            qualityReal.decreaseQualityByOneWithFloor();
        }
    }

    @Override
    public void updateSellin() {
        sellInReal.decreaseByOne();
    }
}

package com.gildedrose.items;

public class OtherItem extends Item{
    public OtherItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    @Override
    public void updateQuality() {
        decreaseQualityByOneWithFloor();
        if (isSellinUnderZero()) {
            decreaseQualityByOneWithFloor();
        }
    }

    private boolean sellInUderZero() {
        return isSellinUnderZero();
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }
}

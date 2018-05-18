package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrieItem extends Item {
    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
        if (sellIn < 0 && quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    public void updateSellin() {
        sellIn = sellIn - 1;
    }
}

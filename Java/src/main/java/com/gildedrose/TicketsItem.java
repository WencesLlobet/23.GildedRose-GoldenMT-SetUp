package com.gildedrose;

public class TicketsItem extends Item {
    public TicketsItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn < 11 && sellIn >= 6 && hasNotOutstandingQuality()) {
            quality = quality + 1;
            return;
        }
        if (sellIn < 6 && hasNotOutstandingQuality()) {
            quality = quality + 2;
        }
    }

    private boolean hasNotOutstandingQuality() {
        return quality < 50;
    }
}

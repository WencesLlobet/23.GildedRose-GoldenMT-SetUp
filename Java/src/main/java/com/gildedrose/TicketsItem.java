package com.gildedrose;

public class TicketsItem extends Item {

    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int OUTSTANDING_QUALITY = 50;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;

    public TicketsItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (hasModerateSellin() && hasNotOutstandingQuality()) {
            quality = quality + 1;
            return;
        }
        if (hasLowSellin() && hasNotOutstandingQuality()) {
            quality = quality + 2;
        }
    }

    private boolean hasLowSellin() {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    private boolean hasModerateSellin() {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= 6;
    }

    private boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }
}

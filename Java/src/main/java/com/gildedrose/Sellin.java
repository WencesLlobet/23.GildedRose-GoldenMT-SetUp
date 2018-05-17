package com.gildedrose;

public class Sellin {
    String id;
    int sellIn;

    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;

    public Sellin(int sellin){
        this.sellIn = sellin;
    }

    protected boolean hasLowSellin() {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    protected boolean hasModerateSellin() {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= 6;
    }

}

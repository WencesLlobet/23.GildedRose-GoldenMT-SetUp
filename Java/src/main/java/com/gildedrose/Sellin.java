package com.gildedrose;

public abstract class Sellin {
    String id;
    int sellIn;

    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;

    protected Sellin(int sellin){
        this.sellIn = sellin;
    }

    public static Sellin createSellin(int sellin) {
        if(hasLowSellin(sellin)) {
            return new LowSellin(sellin);
        }
        return new LowSellin(sellin);
    }

    protected boolean hasLowSellin() {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    protected boolean hasModerateSellin() {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= 6;
    }


    protected static boolean hasLowSellin(int sellIn) {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    protected static boolean hasModerateSellin(int sellIn) {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= 6;
    }

    protected abstract String getType();
}

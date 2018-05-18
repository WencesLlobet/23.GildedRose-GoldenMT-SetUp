package com.gildedrose.sellin;

public abstract class Sellin {
    int sellIn;

    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;
    public static final String UNDER_ZERO = "UNDER_ZERO";
    public static final String MODERATE = "MODERATE";
    public static final String LOW = "LOW";
    public static final String HIGH = "HIGH";

    protected Sellin(int sellin){
        sellIn = sellin;
    }

    public static Sellin createSellin(int sellin) {
        if(hasUnderZeroSellin(sellin)){
            return new HighSellin.UnderZeroSellin(sellin);
        }
        if(hasLowSellin(sellin)) {
            return new LowSellin(sellin);
        }
        if(hasModerateSellin(sellin)) {
            return new ModerateSellin(sellin);
        }
        return new HighSellin(sellin);
    }

    private static boolean hasUnderZeroSellin(int sellin) {
        return sellin < 0;
    }

    protected static boolean hasLowSellin(int sellIn) {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    protected static boolean hasModerateSellin(int sellIn) {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= MINIMUM_FOR_MODERATE_SELLING;
    }

    public abstract String getType();

    public void decreaseByOne() {
        sellIn--;
    }

    public boolean isSellInunderZero() {
        return sellIn < 0;
    }

    public int getSellin() {
        return sellIn;
    }
}

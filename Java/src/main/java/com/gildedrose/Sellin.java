package com.gildedrose;

import com.gildedrose.sellin.HighSellin;
import com.gildedrose.sellin.LowSellin;
import com.gildedrose.sellin.ModerateSellin;

public abstract class Sellin {
    String id;
    int sellIn;

    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;
    public static final String MODERATE = "MODERATE";
    public static final String LOW = "LOW";
    public static final String HIGH = "HIGH";

    protected Sellin(int sellin){
        this.sellIn = sellin;
    }

    public static Sellin createSellin(int sellin) {
        if(hasLowSellin(sellin)) {
            return new LowSellin(sellin);
        }
        if(hasModerateSellin(sellin)) {
            return new ModerateSellin(sellin);
        }
        return new HighSellin(sellin);
    }

    protected static boolean hasLowSellin(int sellIn) {
        return sellIn < MINIMUM_FOR_MODERATE_SELLING;
    }

    protected static boolean hasModerateSellin(int sellIn) {
        return sellIn < MAXIMUM_FOR_MODERATE_SELLIN && sellIn >= MINIMUM_FOR_MODERATE_SELLING;
    }

    protected abstract String getType();
}

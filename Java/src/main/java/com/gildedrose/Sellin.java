package com.gildedrose;

public class Sellin {
    private final int quantity;
    private final SellinType type;
    public static final int MAXIMUM_FOR_MODERATE_SELLIN = 11;
    public static final int MINIMUM_FOR_MODERATE_SELLING = 6;

    private Sellin(int quantity, SellinType type){
        this.quantity = quantity;
        this.type = type;
    }

    public static Sellin createSellin(int quantity) {
        if(hasLowSellin(quantity)) {
            return new Sellin(quantity,SellinType.LOW);
        }
        if(hasModerateSellin(quantity)) {
            return new Sellin(quantity, SellinType.MODERATE);
        }
        return new Sellin(quantity,SellinType.HI);
    }

    private static boolean hasLowSellin(int quantity) {
        return quantity < MINIMUM_FOR_MODERATE_SELLING;
    }

    private static boolean hasModerateSellin( int quantity) {
        return quantity < MAXIMUM_FOR_MODERATE_SELLIN && quantity >= 6;
    }

    public SellinType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}

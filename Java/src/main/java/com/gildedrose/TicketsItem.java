package com.gildedrose;

import java.util.Hashtable;

public class TicketsItem extends Item {

    public static final int OUTSTANDING_QUALITY = 50;
    private final Sellin sellInObj;
    private Hashtable<SellinType, Integer> incrementDerived = new Hashtable<SellinType, Integer>(){{
        put(SellinType.LOW, 2);
        put(SellinType.MODERATE, 1);
        put(SellinType.HI,1);
    }};

    public TicketsItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
        throw new UnsupportedOperationException();
    }

    public TicketsItem(String name, Sellin sellin, int quality){
        super(name,sellin.getQuantity(),quality);
        this.sellInObj = sellin;
    }


    @Override
    public void updateQuality() {
        if(hasOutstandingQuality()){
            return;
        }
        int increment = incrementDerived.get(sellInObj.getType());
        quality += increment;
    }

    private boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }



    private boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }
}

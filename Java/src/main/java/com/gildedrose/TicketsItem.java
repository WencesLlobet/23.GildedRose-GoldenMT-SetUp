package com.gildedrose;

import java.util.Hashtable;

public class TicketsItem extends Item {

    public static final int OUTSTANDING_QUALITY = 50;
    private final Sellin sellInObj;
    private final Hashtable<String,Integer> incrementForGiven = new Hashtable<String,Integer>(){{
        put(Sellin.LOW,2);
        put(Sellin.MODERATE,1);
        put(Sellin.HIGH,0);
    }};

    public TicketsItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.sellInObj = Sellin.createSellin(sellIn);
    }

    @Override
    public void updateQuality() {
        if(hasOutstandingQuality()){
            return;
        }
        quality = quality +  incrementForGiven.get(sellInObj.getType());
    }

    private boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }


    private boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }
}

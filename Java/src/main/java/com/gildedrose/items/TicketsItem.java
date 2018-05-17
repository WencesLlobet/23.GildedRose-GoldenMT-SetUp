package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.Sellin;

import java.util.Hashtable;

public class TicketsItem extends Item {

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

}

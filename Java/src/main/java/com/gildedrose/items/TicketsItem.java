package com.gildedrose.items;

import com.gildedrose.items.sellin.Sellin;

import java.util.Hashtable;

public class TicketsItem extends Item {

    private final Hashtable<String,Integer> incrementForGiven = new Hashtable<String,Integer>(){{
        put(Sellin.LOW,3);
        put(Sellin.MODERATE,2);
        put(Sellin.HIGH,1);
    }};

    public TicketsItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if( qualityReal.isOustanding()){
            return;
        }
        incrementForGiven.put(Sellin.UNDER_ZERO,- getQuality());
        incrementQualityBy(incrementForGiven.get(sellInReal.getType()));
    }

    @Override
    public void updateSellin() {
        decreaseSellinByOne();
    }

}

package com.gildedrose;

import com.gildedrose.items.OtherItem;
import com.gildedrose.items.TicketsItem;

public class ItemBuilder {
    private String name;
    private int sellIn;
    private int quality;

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public ItemBuilder setQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public Item createItem() {
        if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            return new TicketsItem(name, sellIn, quality);
        }
        if(name.equals("Aged Brie")){
            return new AgedBrieItem(name,sellIn,quality);

        } if(name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Item(name, sellIn, quality);
        }
        return new OtherItem(name, sellIn, quality);
    }
}
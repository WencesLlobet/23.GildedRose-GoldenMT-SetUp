package com.gildedrose;

import com.gildedrose.items.AgedBrieItem;
import com.gildedrose.items.OtherItem;
import com.gildedrose.items.TicketsItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            Item currentItem = items[i];
            update(currentItem);
        }
    }

    private void update(Item currentItem) {

        currentItem.updateQuality();
        currentItem.updateSellin();


            if (currentItem instanceof OtherItem) {

                if (currentItem.sellIn < 0) {
                    currentItem.decreaseQualityByOneWithFloor();
                }
            }
            if(currentItem instanceof TicketsItem){
                if (currentItem.sellIn < 0) {
                    currentItem.quality = 0;
                }
            }
            if(currentItem instanceof  AgedBrieItem) {
                if (currentItem.sellIn < 0) {
                    if (currentItem.quality < 50) {
                        currentItem.quality = currentItem.quality + 1;
                    }
                }
            }
    }

    public String itemsToString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item: items
             ) {
            stringBuilder.append(item.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
package com.gildedrose;

import com.gildedrose.items.Item;

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

        currentItem.updateSellin();
        currentItem.updateQuality();

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
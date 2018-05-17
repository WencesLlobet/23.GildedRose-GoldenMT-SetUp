package com.gildedrose;

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
        if (!currentItem.name.equals("Aged Brie") && !currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (currentItem.quality > 0) {
                if (!currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
                    currentItem.quality = currentItem.quality - 1;
                }
            }
        } else {
            if (currentItem.quality < 50) {
                currentItem.quality = currentItem.quality + 1;

                if (currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                  currentItem.updateQuality();
                }
            }
        }

        if (!currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
            currentItem.sellIn = currentItem.sellIn - 1;
        }

        if (currentItem.sellIn < 0) {
            if (!currentItem.name.equals("Aged Brie")) {
                if (!currentItem.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (currentItem.quality > 0) {
                        if (!currentItem.name.equals("Sulfuras, Hand of Ragnaros")) {
                            currentItem.quality = currentItem.quality - 1;
                        }
                    }
                } else {
                    currentItem.quality = currentItem.quality - currentItem.quality;
                }
            } else {
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
package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new ItemBuilder().setName("+5 Dexterity Vest").setSellIn(10).setQuality(20).createItem(), //
                new ItemBuilder().setName("Aged Brie").setSellIn(2).setQuality(0).createItem(), //
                new ItemBuilder().setName("Elixir of the Mongoose").setSellIn(5).setQuality(7).createItem(), //
                new ItemBuilder().setName("Sulfuras, Hand of Ragnaros").setSellIn(0).setQuality(80).createItem(), //
                new ItemBuilder().setName("Sulfuras, Hand of Ragnaros").setSellIn(-1).setQuality(80).createItem(),
                new ItemBuilder().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(15).setQuality(20).createItem(),
                new ItemBuilder().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(10).setQuality(49).createItem(),
                new ItemBuilder().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(5).setQuality(49).createItem(),
                // this conjured item does not work properly yet
                new ItemBuilder().setName("Conjured Mana Cake").setSellIn(3).setQuality(6).createItem()};

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}

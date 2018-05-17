package com.gildedrose;

import static org.junit.Assert.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class GildedRoseCharachterisationTest {

    @Test
    @Parameters({"0, 0",
            "1, 0",
            "2, 0",
            "3, 1",
            "4, 2",
            "20,18"})
    public void random_name_losses_quality_quickly_till_reaching_0_as_limit(int initialQuality, int expectedQuality) {
        Item[] items = new Item[] {new ItemBuilder().setName("foo").setSellIn(0).setQuality(initialQuality).createItem()};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

    @Test
    @Parameters({"0, 2",
            "1, 3",
            "2, 4",
            "48, 50",
            "49, 50",
            "50, 50"})
    public void aged_brie_rises_quality_quickly_till_reaching_an_outstanding_quality(int intialQuality, int expectedQuality) {
        Item[] items = new Item[] {new ItemBuilder().setName("Aged Brie").setSellIn(0).setQuality(intialQuality).createItem()};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

    @Test
    @Parameters({"0, 0",
            "100, 100",
            "40, 40",
            "37, 37",
            "36, 36",
            "2,2"})
    public void sulfuras_dont_change_quality(int initialQuality, int expectedQuality) {
        Item[] items = new Item[] {new ItemBuilder().setName("Sulfuras, Hand of Ragnaros").setSellIn(0).setQuality(initialQuality).createItem()};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

    @Test
    @Parameters({"7, 8, 11",
            "7, 8, 50",
            "10, 11, 60",
            "30, 31, 50",
            "49, 50, 50",

            "50, 50, 50",
            "70, 70, 50"})
    public void backstage_passes_increment_quality_if_they_have_not_an_outstanding_quality(int initialQuality, int expectedQuality, int sellin) {
        Item[] items = new Item[] {new ItemBuilder().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(sellin).setQuality(initialQuality).createItem()};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

    @Test
    @Parameters({"7, 9, 10",
                 "4, 6, 9",
                 "4, 6, 8",
                 "4, 6, 7",
                 "4, 6, 6",

                 "4, 7, 5",
                 "4, 7, 4"})
    public void tickets_qualitiy_increases_more_as_less_tickets_are_sold(int initalQuality, int expectedQuality, int sellin) {
        Item[] items = new Item[] {new ItemBuilder().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(sellin).setQuality(initalQuality).createItem()};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

}

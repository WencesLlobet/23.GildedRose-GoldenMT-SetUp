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
    public void random_name_losses_2_quality_with_0_as_limit(int initialQuality, int expectedQuality) {
        Item[] items = new Item[] { new Item("foo", 0, initialQuality) };
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
    public void aged_brie_rises_quality_till_reaching_an_outstanding_quality(int intialQuality, int expectedQuality) {
        Item[] items = new Item[] { new Item("Aged Brie", 0, intialQuality) };
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
    public void sulfuras_dont_change_quality_regadless_any_previous_quality(int initialQuality, int expectedQuality) {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, initialQuality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

    @Test
    @Parameters({"7, 8, 11",
            "7, 8, 50",
            "7, 8, 60",
            "30, 31, 50",
            "49, 50, 50",

            "50, 50, 50",
            "70, 70, 50"})
    public void backstage_passes_increment_quality_if_they_have_not_an_outstanding_quality(int initialQuality, int expectedQuality, int sellin) {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellin, initialQuality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expectedQuality, app.items[0].quality);
    }

}

package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseCharachterisationTest {

    @Test
    public void random_name_losses_2_quality_with_0_as_limit() {
        Item[] items = new Item[] { new Item("foo", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(48, app.items[0].quality);
    }

    @Test
    public void aged_brie_rises_quality_by_2_till_50() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 32) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(34, app.items[0].quality);
    }

}

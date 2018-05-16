package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.Test;

import javax.naming.NamingException;
import java.util.ArrayList;
import java.util.Random;

public class GildedRoseGoldenMasterTest {
    private static final int MINIMUM = -10;
    private static final int MAXIMUM = 50;
    private int SEED = 100;
    private int NUM_OF_TESTS = 4000;
    private Random random = new Random(SEED);

    private String[] names = new String[]{
            "+5 Dexterity Vest",
            "Aged Brie",
            "Elixir of the Mongoose",
            "Sulfuras, Hand of Ragnaros",
            "Backstage passes to a TAFKAL80ETC concert",
            "Conjured Mana Cake"
    };

    @Test
    public void
    golden_master_test() throws Exception {
        Item[] items = generateItems();
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Approvals.verify(gildedRose.itemsToString());
    }

    private Item[] generateItems() {
        ArrayList<Item> list = new ArrayList<>();
        for(int i=0; i< NUM_OF_TESTS; i++){
            list.add(nexRandomItem());
        }
        return list.toArray(new Item[]{});
    }

    private Item nexRandomItem() {
        Item item = new Item(nextRandomName(),2,nextRandomInt(MINIMUM,MAXIMUM));
        return item;
    }

    private String nextRandomName() {
        return names[random.nextInt(names.length)];
    }

    private int nextRandomInt(int minimum, int maximum){
        return random.nextInt(maximum+minimum) - minimum;
    }
}

package com.gildedrose;

public class Item {

    public static final int OUTSTANDING_QUALITY = 50;
    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
    }

    protected boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }

    protected boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }

    void decreaseQualityByOne(){
        if(quality > 0){
            quality--;
        }
    }
}

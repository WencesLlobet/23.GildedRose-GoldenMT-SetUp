package com.gildedrose;

public abstract class Item {

    public static final int OUTSTANDING_QUALITY = 50;
    public String name;

    public int sellIn;
    public Sellin sellInReal;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.sellInReal = Sellin.createSellin(sellIn);
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public abstract void updateQuality();

    protected boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }

    protected boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }

    protected void decreaseQualityByOneWithFloor(){
        if(quality > 0){
            decreaseQualityByOne();
        }
    }

    protected void decreaseQualityByOne() {
        quality--;
    }

    public abstract void updateSellin();
}

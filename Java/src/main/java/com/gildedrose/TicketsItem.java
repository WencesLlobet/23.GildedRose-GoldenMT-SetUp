package com.gildedrose;

public class TicketsItem extends Item {

    public static final int OUTSTANDING_QUALITY = 50;
    private final Sellin sellInObj;

    public TicketsItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.sellInObj = Sellin.createSellin(sellIn);
    }

    @Override
    public void updateQuality() {
        if(hasOutstandingQuality()){
            return;
        }
        if (sellInObj.getType().equals(Sellin.MODERATE) ){
            quality = quality + 1;
            return;
        }
        if (sellInObj.getType().equals(Sellin.LOW) ){
            quality = quality + 2;
        }
    }

    private boolean hasOutstandingQuality() {
        return !hasNotOutstandingQuality();
    }


    private boolean hasNotOutstandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }
}

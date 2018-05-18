package com.gildedrose.items;

public class Quality {
    private int quality;
    protected static final int OUTSTANDING_QUALITY = 50;

    public Quality(int quality){

        this.quality = quality;
    }

    protected void decreaseQualityByOneWithFloor(){
        if(quality > 0){
            decreaseQualityByOne();
        }
    }

    protected void decreaseQualityByOne() {
        quality--;
    }

    public void incraseByOne() {
        quality++;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isNotOustandingQuality() {
        return quality < OUTSTANDING_QUALITY;
    }

    public boolean isOustandingQuality() {
        return !isNotOustandingQuality();
    }
}

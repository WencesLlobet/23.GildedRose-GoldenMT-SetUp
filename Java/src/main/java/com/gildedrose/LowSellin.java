package com.gildedrose;

public class LowSellin extends Sellin {
    public LowSellin(int sellin) {
        super(sellin);
    }

    @Override
    protected String getType() {
        return "LOW";
    }


}

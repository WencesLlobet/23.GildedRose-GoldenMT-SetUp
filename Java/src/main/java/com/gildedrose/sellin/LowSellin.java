package com.gildedrose.sellin;

import com.gildedrose.Sellin;

public class LowSellin extends Sellin {
    public LowSellin(int sellin) {
        super(sellin);
    }

    @Override
    protected String getType() {
        return LOW;
    }


}

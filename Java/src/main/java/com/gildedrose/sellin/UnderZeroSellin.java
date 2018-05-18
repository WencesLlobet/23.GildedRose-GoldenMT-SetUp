package com.gildedrose.sellin;

public class UnderZeroSellin extends Sellin {
    public UnderZeroSellin(int sellin) {
        super(sellin);
    }

    @Override
    public String getType() {
        return UNDER_ZERO;
    }
}

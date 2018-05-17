package com.gildedrose.sellin;


import com.gildedrose.Sellin;

public class HighSellin extends Sellin {
    public HighSellin(int sellin) {
        super(sellin);
    }

    @Override
    protected String getType() {
        return HIGH;
    }
}

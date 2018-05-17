package com.gildedrose.sellin;

import com.gildedrose.Sellin;

public class ModerateSellin extends Sellin {

    public ModerateSellin(int sellin) {
        super(sellin);
    }

    @Override
    public String getType() {
        return MODERATE;
    }
}

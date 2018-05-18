package com.gildedrose.items.sellin;


public class HighSellin extends Sellin {
    public HighSellin(int sellin) {
        super(sellin);
    }

    @Override
    public String getType() {
        return HIGH;
    }

    public static class UnderZeroSellin extends Sellin {
        public UnderZeroSellin(int sellin) {
            super(sellin);
        }

        @Override
        public String getType() {
            return UNDER_ZERO;
        }
    }
}

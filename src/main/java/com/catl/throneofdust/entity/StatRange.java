package com.catl.throneofdust.entity;

public class StatRange {
    private final int min;
    private final int max;

    public StatRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() { return min; }
    public int getMax() { return max; }
}

package com.catl.throneofdust.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Stat {
    @Enumerated(EnumType.STRING)
    private StatType type;
    private int value;

    public Stat() {}

    public Stat(StatType type, int value) {
        this.type = type;
        this.value = value;
    }

    public StatType getType() {
        return type;
    }

    public void setType(StatType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

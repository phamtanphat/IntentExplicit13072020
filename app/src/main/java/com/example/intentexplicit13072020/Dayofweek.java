package com.example.intentexplicit13072020;

public enum Dayofweek{
    WEDNESDAY(4),
    SUNDAY(1),
    TUESDAY(3),
    FRIDAY(6),
    MONDAY(2),
    SATURDAY(7),
    THURSDAY(5),
    ;

    public final int value;
    Dayofweek(int value) {
        this.value = value;
    }
}

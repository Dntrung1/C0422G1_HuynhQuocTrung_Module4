package com.codegym.model;

public class Day {
    private int day;

    public Day() {
    }

    public Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.valueOf(day);
    }
}

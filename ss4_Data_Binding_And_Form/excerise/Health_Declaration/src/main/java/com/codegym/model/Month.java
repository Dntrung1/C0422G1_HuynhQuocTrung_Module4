package com.codegym.model;

public class Month {
    private int month;

    public Month() {
    }

    public Month(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return String.valueOf(month);
    }
}

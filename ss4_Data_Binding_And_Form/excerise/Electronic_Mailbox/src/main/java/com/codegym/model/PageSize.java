package com.codegym.model;

public class PageSize {
    private int size;

    public PageSize() {
    }

    public PageSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }
}

package com.trainingbasket.fp.beans;

public class Display {
    public Display(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size='" + size + '\'' +
                '}';
    }

    String size;

}

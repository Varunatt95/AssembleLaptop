package com.trainingbasket.fp.beans;

public class RAM {
    @Override
    public String toString() {
        return "RAM{" +
                "mb='" + mb + '\'' +
                '}';
    }

    public RAM(String mb) {
        this.mb = mb;
    }

    String mb;
}

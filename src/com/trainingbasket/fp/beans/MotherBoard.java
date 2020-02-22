package com.trainingbasket.fp.beans;

public class MotherBoard {

    public MotherBoard(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "company='" + company + '\'' +
                '}';
    }

    String company;

}

package com.trainingbasket.fp.beans;

public class Battery {

    String backuptime;


    public Battery(String backuptime) {
        this.backuptime = backuptime;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "backuptime='" + backuptime + '\'' +
                '}';
    }

}

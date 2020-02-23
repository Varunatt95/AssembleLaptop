package com.trainingbasket.fp.beans;

public class Battery {

    private String backuptime;
    private String chargingtime;
    private String internalresistance;
    private float cost;

    public Battery(String backuptime, String chargingtime, String internalresistance, float cost) {
        this.backuptime = backuptime;
        this.chargingtime = chargingtime;
        this.internalresistance = internalresistance;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "backuptime='" + backuptime + '\'' +
                ", chargingtime='" + chargingtime + '\'' +
                ", internalresistance='" + internalresistance + '\'' +
                ", cost=" + cost +
                '}';
    }
}

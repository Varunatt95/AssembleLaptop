package com.trainingbasket.fp.beans;

public class Display {
    private String size;
    private String paneltype;
    private String resolution;
    private String ppi;
    private float cost;

    public Display(String size, String paneltype, String resolution, String ppi, float cost) {
        this.size = size;
        this.paneltype = paneltype;
        this.resolution = resolution;
        this.ppi = ppi;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size='" + size + '\'' +
                ", paneltype='" + paneltype + '\'' +
                ", resolution='" + resolution + '\'' +
                ", ppi='" + ppi + '\'' +
                ", cost=" + cost +
                '}';
    }
}

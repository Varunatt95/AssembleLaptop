package com.trainingbasket.fp.beans;

import javax.xml.transform.sax.SAXSource;
import java.security.Key;

public class Runner {
    public static void main(String[] args) {
        Battery wt100 = new Battery("100 Watt Battery 7 hours power backup");
        Display display = new Display("Curved UHD Display");
        Keybord  keybord= new Keybord("DELL","ButterFly",4500);
        MotherBoard motherBoard = new MotherBoard("Intel ");
        Processor processor=  new Processor("9th Gen ");
        RAM ram= new RAM("10 GB");

        Chasis MLP2020= new Chasis(wt100,display,keybord,motherBoard,ram,processor);
        System.out.println(MLP2020);
    }
}

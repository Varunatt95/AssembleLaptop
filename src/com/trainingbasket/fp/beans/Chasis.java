package com.trainingbasket.fp.beans;

public class Chasis {

    private  static  int tempId;
    private  int id;
    private  Battery battery;
    private  Display display;
    private Keybord keybord;
    private MotherBoard motherBoard;
    private  RAM ram;
    private  Processor processor;

    public Chasis(Battery battery, Display display, Keybord keybord, MotherBoard motherBoard, RAM ram, Processor processor) {
        this.id =++tempId;
        this.battery = battery;
        this.display = display;
        this.keybord = keybord;
        this.motherBoard = motherBoard;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Chasis{" +
                "id=" + id +
                ", battery=" + battery +
                ", display=" + display +
                ", keybord=" + keybord +
                ", motherBoard=" + motherBoard +
                ", ram=" + ram +
                ", processor=" + processor +
                '}';
    }
}

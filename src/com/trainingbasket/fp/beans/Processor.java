package com.trainingbasket.fp.beans;

public class Processor {
    public Processor(String generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "generation='" + generation + '\'' +
                '}';
    }

    String generation;

}

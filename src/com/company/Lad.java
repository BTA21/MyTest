package com.company;

public class Lad extends Car {
    private boolean isMPerformance = false;
    Lad(boolean isMPerformance, String model, float weight,
        String color, boolean isWork, short speed) {
        super(model, weight, color, isWork);
        this.isMPerformance = isMPerformance;
        this.speed = speed;
    }

    @Override
    void startEngine() {
        System.out.println("Врум, врум!");
    }

    void printAll() {
        super.printAll();
        String isMPerformance = this.isMPerformance?"является":"не является";
        System.out.println("Машина " + isMPerformance + " М перформанс");
        super.engine.drive();
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car((short)160);
//        lada.speed = 160;
        lada.setAll("kalina",1320.2f,"White",true);
        lada.printAll();
//        System.out.println(lada.speed);

        Car chevrolet = new Car("camaro",1072.67f,"yellow",true);
        chevrolet.speed = 200;
//        chevrolet.setAll("camaro",1072.67f,"yellow",true);
//        chevrolet.printAll();
//        System.out.println(chevrolet.speed);

    }


}

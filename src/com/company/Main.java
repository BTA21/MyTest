package com.company;

public class Main {

    public static void main(String[] args) {
//        Car lada = new Car((short)160);
//        lada.speed = 160;
//        lada.setAll("kalina",1320.2f,"White",true);
//        lada.printAll();
//        System.out.println(lada.speed);

//        Car chevrolet = new Car("camaro",1072.67f,"yellow",true);
//        chevrolet.speed = 200;
//        chevrolet.setAll("camaro",1072.67f,"yellow",true);
//        chevrolet.printAll();
//        System.out.println(chevrolet.speed);

        Lad kal = new Lad(true,"kalina",1320.2f,"White",true, (short)145);
        kal.printAll();
        kal.startEngine();

        Tesla obj = new Tesla(){
          private boolean isWork;
          public void isDrive( ){
              this.isWork=true;
          }
          public void printAll(){
              System.out.println(isWork);
          }
        };

        obj.printAll();
        obj.isDrive();
        obj.printAll();


    }


    private static class Tesla {
        public void printAll() {}
        public void isDrive() {}
    }
}

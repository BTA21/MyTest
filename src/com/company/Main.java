package com.company;

public class Main {

    public static void main(String[] args) {
        Person azamat = new Person(23, Personality.MALE);
        System.out.println(azamat.getAge());
        azamat.talk();

        Alien ozamat = new Alien(300, Personality.ALIEN);
        System.out.println(azamat.getAge());
        ozamat.talk();
    }
}

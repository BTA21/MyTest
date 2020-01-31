package com.company;

public class Alien implements HumanI {
    private int age;
    private Personality person;
    Alien(int age, Personality person){
        this.age = age;
        this.person=person;
    }

    @Override
    public void talk() {
        System.out.println("Мы пришли с миром!");
        System.out.println(this.person);
    }

    @Override
    public void walk() {
        System.out.println("Полетел я!");
    }

    @Override
    public int getAge() {
        return 0;
    }
}

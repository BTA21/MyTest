package com.company;

public class Person implements HumanI {
    private int age;
    private Personality person;
    Person(int age, Personality person){
        this.age = age;
        this.person=person;
    }

    @Override
    public void talk() {
        System.out.println("My heart is a ghost town!");
        System.out.println(this.person);
    }

    @Override
    public void walk() {
        System.out.println("Пошёл я!");

    }

    @Override
    public int getAge() {
        return 0;
    }
}

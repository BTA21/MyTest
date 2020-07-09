package com.company;

public class Elements extends Thread {
    public void run() {
        for (int i = 1; i <= 21; i++)
            System.out.println("Элемент: " + i);
    }
}

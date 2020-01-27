package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[] arr = new float[] {5.7f, 3.1f, 0.035f};
        try {
            System.out.println(arr[3]);
            int result = 13 / 1;
        } catch(ArithmeticException e) {
            System.out.println("Ошибка: " +  e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " +  e);
        } finally {
            System.out.println("Сработал блок finally!");
        }
    }

}

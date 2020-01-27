package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int num = 21;
       String[] names = new String[3];
       String[] surnames = new String[3];
       int[] ages = new int[3];
       mkArr(names);
       mkArr(surnames);
       mkArr(ages);
        printArr(names);
        printArr(surnames);
        printArr(ages);
        int result = sum(24,-3);
        printArr(result);

    }
    public static String[] mkArr(String[] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("Список имён");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i+1) + " элемент:");
            arr[i] = in.nextLine();
        }
        return arr;
    }

    public static int[] mkArr(int[] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("Список возрастов");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i+1) + " элемент:");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static void printArr(String[] arr) {
        for(String anArr : arr)
            System.out.println("Значение элемента: " + anArr);

        System.out.println(" ");

    }

    public static void printArr(int[] arr) {
        for(int anArr : arr)
            System.out.println("Значение элемента: " + anArr);

        System.out.println(" ");

    }
    public static void printArr(int word) {
            System.out.println(word);
    }

    public static int sum(int a, int b){
        int res = a + b;
        return res;
    }

}

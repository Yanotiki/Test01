package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class MinMassive {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)

                min = array[i];
        }
        System.out.println(min);
    }
}

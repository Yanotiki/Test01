package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
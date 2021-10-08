package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/*
Площадь круга
*/

public class Double {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();

        if (radius > 0) {
            double pi = 3.14;
            int s = (int) (pi * radius * radius);
            System.out.println(s);
        }
    }
}
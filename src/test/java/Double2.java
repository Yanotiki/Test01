package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/*
Площадь круга
*/

public class Double2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cola = console.nextInt();
        int people = console.nextInt();
        double d = 1.0 * cola/people;
        System.out.println(d);
    }
}
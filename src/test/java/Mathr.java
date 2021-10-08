package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/*
Скорость ветра
*/

public class Mathr {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int i = console.nextInt();
            double m = 3.6;
            int v = (int) Math.round (m * i);
            System.out.println(v);

        }
}
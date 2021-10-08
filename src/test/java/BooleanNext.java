package com.javarush.task.pro.task04.task0417;
import java.util.Scanner;

public class BooleanNext {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double glass = 0.5;
        boolean i = console.nextBoolean();
        int result;
        if (i) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }
}

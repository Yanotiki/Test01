package com.javarush.task.pro.task04.task0414;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int i = console.nextInt();
        do {
            System.out.println(s);
            i--;
        }
        while (i > 0 && i < 4);
    }
}

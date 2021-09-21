package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

public class
Solution {
        public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //напишите тут ваш код
    int max = Integer.MAX_VALUE;
    if (scanner.hasNextInt())
    {
        while (scanner.hasNextInt())
        {
            int x = scanner.nextInt();
            if (x < max)
                max = x;

        }
    }
    System.out.println(max);
}
}

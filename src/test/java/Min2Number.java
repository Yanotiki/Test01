import java.util.Scanner;

public class Min2Number {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int min2 = console.nextInt();

        if (min2 < min) {
        int tmp = min;
        min = min2;
        min2 = tmp;
}
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (min == min2) {
                if (x < min) {
                    min = x;
                } else {
                    min2 = x;
                }
            }
                if (x < min) {
                    min2 = min;
                    min = x;
                } else if (x > min && x < min2) {
                    min2 = x;
                }
            }
        System.out.println(min2);
    }
}
package One;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        doCalculate();
    }

    public static void doCalculate() {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        int counter = 0;

        while (number > 1) {
            if (number % 2 == 0) {
                number = number / 2;
                counter++;
            } else {
                number = number + 1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}

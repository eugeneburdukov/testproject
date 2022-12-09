package Three;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number % 3 == 0 && isTwo(number) && isTwoDigits(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isTwoDigits(long number) {
        int count = 0;

        for (int i = 0; number > 0; i++) {
            number = number / 10;
            count++;
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTwo(long number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
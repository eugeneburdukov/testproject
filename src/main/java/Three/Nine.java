package Three;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        if (isPerfectSquare(number))
            System.out.print((int) Math.sqrt(number));
        else
            System.out.print("No");
    }

    static boolean isPerfectSquare(long number) {
        if (number >= 0) {
            long temp = (long) Math.sqrt(number);
            return ((temp * temp) == number);
        }
        return false;
    }
}

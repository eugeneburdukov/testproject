package Three;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(doMin(a, b, c) + " " + doMiddle(a, b, c) + " " + doMax(a, b, c));
    }

    public static long doMin(long a, long b, long c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a) {
            return b;
        } else {
            return c;
        }
    }

    public static long doMiddle(long a, long b, long c) {
        if (a != doMin(a, b, c) && a != doMax(a, b, c)) {
            return a;
        } else if (b != doMin(a, b, c) && b != doMax(a, b, c)) {
            return b;
        } else {
            return c;
        }
    }

    public static long doMax(long a, long b, long c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }
}

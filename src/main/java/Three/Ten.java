package Three;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long result = a + b + c;

        if (isTriangle(a, b, c) == true) {
            System.out.println(result);
        } else {
            System.out.println("No");
        }
    }

    public static boolean isTriangle(long a, long b, long c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}

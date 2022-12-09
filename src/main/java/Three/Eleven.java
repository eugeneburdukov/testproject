package Three;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();


        if (isTriangle(a, b, c) == true) {
            if (a == b || a == c || b == c) {
                System.out.println(a + b + c);
            } else {
                System.out.println("No");
            }
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

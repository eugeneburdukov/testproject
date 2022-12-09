package One;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long n = scanner.nextLong();

        long result = (long) Math.pow(a, n);
        System.out.println(result);
    }
}


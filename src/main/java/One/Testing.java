package One;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long result = 10 * n - (10 * (n - 1));

        System.out.println(result / 2);
    }
}

package One;

import java.util.Scanner;

public class PerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long p = 2 * (a + b);
        long s = a * b;
        System.out.println(p + " " + s);
    }
}

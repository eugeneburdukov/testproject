package One;

import java.util.Scanner;

public class PerimeterAndAreaTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        long p = 4 * a;
        long s = a * a;

        System.out.println(p + " " + s);
    }
}

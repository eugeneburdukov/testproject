package Three;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a > b) {
            System.out.println(b + " " + a);
        } else {
            System.out.println(a + " " + b);
        }
    }
}

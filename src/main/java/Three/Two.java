package Three;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}

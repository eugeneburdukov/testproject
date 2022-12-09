package Three;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        if (a > 0 && b < 0 && c < 0 || b > 0 && c < 0 && a < 0 || c > 0 && b < 0 && a < 0) {
            System.out.println("YES");
        } else if (a < 0 && b > 0 && c > 0 || b < 0 && c > 0 && a > 0|| c < 0 && a > 0 && b > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

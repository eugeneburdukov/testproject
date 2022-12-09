package Three;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number % 2 == 0 && number > 0) {
            System.out.println("NO");
        } else if (number % 2 != 0 && number < 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

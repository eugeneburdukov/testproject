package Three;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number % 2 == 0) {
            System.out.println(number - 1);
        } else {
            System.out.println(number - 2);
        }
    }
}

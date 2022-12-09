package Two;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        long firstNumber = number / 100;
        long lastNumber = number % 10;
        long result = firstNumber * 10 + lastNumber;

        System.out.println(result);
    }
}

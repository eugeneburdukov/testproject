package One;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int counter = 0;
        for (int i = 0; number > 0; i++) {
            counter++;
            number = number / 10;
        }
        System.out.println(counter);
    }
}

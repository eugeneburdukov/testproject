package Two;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long result = 0;

        for (int i = 0; number > 0; i++) {
            if (i == 1) {
                result = number % 10;
            }
            number = number / 10;
        }
        System.out.println(result);
    }
}

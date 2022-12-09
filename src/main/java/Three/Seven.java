package Three;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        System.out.println(verify(number));
    }

    public static String verify(long number) {
        if (number < 0) {
            number = number * -1;
        }
        int count = 0;
        for (int i = 0; number > 0; i++) {
            number = number / 10;
            count++;
        }

        if (count == 2) {
            return "Ok";
        } else {
            return "No";
        }
    }
}

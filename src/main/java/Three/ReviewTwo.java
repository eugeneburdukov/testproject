package Three;

import java.util.Scanner;

public class ReviewTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (verify(number) == true) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }

    public static boolean verify(long number) {
        int count = 0;
        long tempNumber = 0;
        if (number > 0) {
            tempNumber = number;
        } else {
            tempNumber = number * -1;
        }

        for (int i = 0; tempNumber > 0; i++) {
            tempNumber = tempNumber / 10;
            count++;
        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}

package Three;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number % 2 != 0) {
            System.out.println("YES");
        } else if(number > 0 && isVerified(number)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isVerified(long number) {
        int count = 0;

        for (int i = 0; number > 0; i++) {
            number = number / 10;
            count++;
        }

        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
}

package Three;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long fistNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();

        if (fistNumber % secondNumber == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

package Four;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; number > 0; i++) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }
}

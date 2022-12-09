package Four;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        while (number % 2 != 0) {
            number++;
        }
        System.out.println(number);
    }
}

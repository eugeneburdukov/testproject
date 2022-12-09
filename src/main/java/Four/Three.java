package Four;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number % 7 != 0) {
            number++;
        }
        System.out.println(number);
    }
}

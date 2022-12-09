package Four;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            int result = number / 5;
            System.out.println(result);
        } else {
            while (number % 5 != 0) {
                number--;
            }
            System.out.println(number);
        }
    }
}

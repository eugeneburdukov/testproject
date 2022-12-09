package Four;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 10 == 0) {
            System.out.println(number + 10);
        } else {
            while (number % 10 != 0) {
                number++;
            }
            System.out.println(number);
        }
    }
}

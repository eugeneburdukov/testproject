package Four;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int result = 0;

        do {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                result = result + number;
            }
        } while (number != 0);

        System.out.println(result);
    }
}

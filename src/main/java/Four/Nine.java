package Four;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;

        do {
            number = scanner.nextInt();
            if (number % 2 != 0) {
                count++;
            }
        } while (number != 0);

        System.out.println(count);
    }
}

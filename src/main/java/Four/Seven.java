package Four;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        int number;
        int negative = 0;

        do {
            number = scanner.nextInt();
            if (number < 0) {
                negative++;
            }
            count++;
        } while (number != 0);

        System.out.println(negative);
    }
}

package Four;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        int number;
        int result = 0;

        do {
            number = scanner.nextInt();
            result = result + number;
            count++;
        } while (number != 0);

        System.out.println(result);
    }
}

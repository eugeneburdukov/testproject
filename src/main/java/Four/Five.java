package Four;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = -1;
        int number;

        do {
            number = scanner.nextInt();
            count++;
        } while (number != 0);

        System.out.println(count);
    }
}

package Four;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;

        if (number < 0) {
            number = number * -1;
        }

        while (i <= number) {
            System.out.print(i + " ");
            i = i * 2;
        }
    }
}

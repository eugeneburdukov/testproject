package Four;

import java.util.Scanner;

public class Tvelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int temp = 1;

        while (count != number) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");
                count++;
            }
            temp = temp + 1;

        }
    }
}

package Four;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 2, stop = (int) Math.sqrt(number); i <= stop; i++) {
            if (i == stop) {
                System.out.print(1);
                break;
            }
            if (number % i == 0) {
                System.out.println(0);
                break;
            }
        }
    }
}

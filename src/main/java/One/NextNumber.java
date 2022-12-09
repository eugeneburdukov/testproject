package One;

import java.util.Scanner;

public class NextNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long nextNumber = n + 1;

        System.out.println(nextNumber);
    }
}

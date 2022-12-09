package Two;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long resultOne = a / 10;
        long resultTwo = a % 10;
        System.out.println(resultOne + " " + resultTwo);
    }
}

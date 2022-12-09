package Two;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();

        long resultOne = m / n;
        long resultTwo = m - (resultOne * 10);
        System.out.println(resultTwo);
    }
}
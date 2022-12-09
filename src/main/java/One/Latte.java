package One;

import java.util.Scanner;

public class Latte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int resultFirst = (int) Math.pow(10, number);
        int resultSecond = (int) Math.pow(10, number - 1);
        int result = resultFirst - resultSecond;

        int resultTwo = result / 2;
        System.out.println(resultTwo);
    }
}

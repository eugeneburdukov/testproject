package One;

import java.util.Scanner;

public class IntSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;

        System.out.println(result);
    }
}

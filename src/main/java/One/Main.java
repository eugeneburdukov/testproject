package One;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber = n / 10;
        int secondNumber = n % 10;
        System.out.println(firstNumber + " " + secondNumber);
    }
}

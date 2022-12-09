package One;

import java.util.Scanner;

public class LatteTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = (int) Math.pow(5, number);
        System.out.println(result);
    }
}

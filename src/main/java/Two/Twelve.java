package Two;

import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (((x - y) * (x - y)) / (Math.sqrt(x * x + y * y - 1))) + Math.sqrt(x * x + y * y - 1) / (2 * x * y);
        System.out.printf("%.3f", result);
    }
}

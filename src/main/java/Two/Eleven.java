package Two;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (Math.sqrt(x * x + y * y)) / ((x - y) * (x - y)) - (2 * x * y) / Math.sqrt(x * x + y * y);
        System.out.printf("%.3f", result);
    }
}

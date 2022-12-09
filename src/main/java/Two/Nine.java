package Two;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (2 * x + y) / (x * x - x * y + 4 * y * y) + (2 * x * x - x * y + y * y) / (x + 4 * y);
        System.out.printf("%.3f", result);
    }
}

package Two;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (2 * x * x) - (4 * x * y) + (3 * y * y) + ((x + y) / 7);
        System.out.printf("%.3f", result);
    }
}

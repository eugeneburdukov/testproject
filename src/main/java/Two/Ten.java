package Two;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (2 * x * y) / Math.sqrt(x * x + y * y) - ((x + y - 1) * (x + y - 1)) / (x * y);
        System.out.printf("%.3f", result);
    }
}

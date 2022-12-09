package Two;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = ((x * x - 2 * x * y + 4 * y * y) / (x + 5)) + ((3 * x * x) - y * y) / (y - 7);
        System.out.printf("%.3f", result);
    }
}

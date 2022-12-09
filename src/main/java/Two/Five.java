package Two;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;

        double x = scanner.nextDouble();

        y = (2 * x / ((Math.sqrt(x * x + 1))) - ((Math.sqrt(x * x + 1)) / (x * x * x)));
        System.out.printf("%.3f", y);
    }
}
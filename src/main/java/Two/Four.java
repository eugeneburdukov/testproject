package Two;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;

        double x = scanner.nextDouble();

        y = ((2 * x - 1) / (x * x)) + (Math.sqrt(x * x + 1) / 2);
        System.out.printf("%.3f", y);
    }
}

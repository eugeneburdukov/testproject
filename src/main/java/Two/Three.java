package Two;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;

        double x = scanner.nextDouble();

        y = ((x * x + 3 * x - 4) / (2 * x - 3)) - ((x + 2) / (x * x - 5 * x + 7));

        System.out.printf("%.3f",y);
    }
}

package Two;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;

        double x = scanner.nextDouble();

        y = (Math.sqrt(x * x * x * x + 1) / (x * x)) - Math.sqrt((x * x) / (x * x + 1));
        System.out.printf("%.3f", y);
    }
}

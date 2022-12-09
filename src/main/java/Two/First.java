package Two;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;

        y = x * x * x - ((5 * x * x) / 7) + 9 * x - (3 / x) + 1;
//        String result = String.format("%.3f", y);
//        System.out.println(result);

        System.out.printf("%.3f",y);
    }
}

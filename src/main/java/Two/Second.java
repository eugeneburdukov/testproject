package Two;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        double x = scanner.nextDouble();

        y = x - ((x * x + 4) / 2) + x * x * x - (3 / (x + 7));

        System.out.println(y);
    }
}

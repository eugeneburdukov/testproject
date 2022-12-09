package One;

import java.util.Scanner;

public class SurfaceAreaAndVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long s = 2 * (a * b + b * c + a * c);
        long v = a * b * c;

        System.out.println(s + " " + v);
    }
}

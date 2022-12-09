package One;

import java.util.Scanner;

public class SurfaceAreaAndVolumeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        long s = 6 * a * a;
        long v = a * a * a;

        System.out.println(s + " " + v);
    }
}

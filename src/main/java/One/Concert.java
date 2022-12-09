package One;

import java.util.Scanner;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = new long[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLong();
        }

        long a = array[0];
        long b = array[1];
        long c = array[2];
        long result = a + b - c;
        System.out.println(result);

    }
}

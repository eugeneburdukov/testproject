package One;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = new long[2];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLong();
        }

        long firstNumber = array[0];
        long secondNumber = array[1];
        long result = firstNumber + secondNumber;
        System.out.println(result);

    }
}

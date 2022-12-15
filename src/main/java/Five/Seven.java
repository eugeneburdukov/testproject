package Five;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();

        int[] array = new int[lastNumber - firstNumber + 1];
        array[0] = firstNumber;
        array[array.length - 1] = lastNumber;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

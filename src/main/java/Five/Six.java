package Five;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = scanner.nextInt();
        int maxNumber = scanner.nextInt();

        int[] array = new int[maxNumber - minNumber + 1];
        array[0] = maxNumber;
        array[array.length - 1] = minNumber;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] - 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

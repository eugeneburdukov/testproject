package Five;

import java.util.Scanner;

public class BiggerThenPrevious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                System.out.print(array[i + 1] + " ");
            }
        }
    }
}

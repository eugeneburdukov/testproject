package Five;

import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 0 && array[i + 1] > 0) {
                System.out.println(array[i] + " " + array[i + 1]);
            } else if (array[i] < 0 && array[i + 1] < 0) {
                System.out.println(array[i] + " " + array[i + 1]);
            }
        }


    }
}

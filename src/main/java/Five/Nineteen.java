package Five;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result = result + array[i];
            }
        }

        System.out.println(result);
    }
}

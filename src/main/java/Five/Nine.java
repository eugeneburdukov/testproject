package Five;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        doInitialize();
    }

    public static void doInitialize() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

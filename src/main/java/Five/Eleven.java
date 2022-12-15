package Five;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }

        if (count <= 0) {
            System.out.println("NO");
        } else {
            System.out.println(count);
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}

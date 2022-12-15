package Six;

import java.util.Scanner;

public class Nine {
    //Начальные значения элементов
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        doShowModifiedArray(array);
    }

    public static int doMin(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static void doShowModifiedArray(int[] a) {
        int x = doMin(a) / 2;

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - x;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}

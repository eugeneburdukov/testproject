package Six;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        doChange(array);
    }

    public static void doChange(int[] a) {
        int temp = a[a.length - 1];
        a[doMaxIndex(a)] = temp;
        a[a.length - 1] = doMax(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
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

    public static int doMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int doMinIndex(int[] a) {
        int min = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                index = i;
            }
        }
        return index;
    }

    public static int doMaxIndex(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i]) {
                max = a[i];
                index = i;
            }
        }
        return index;
    }
}

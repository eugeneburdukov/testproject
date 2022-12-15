package Six;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(doCount(array));

    }

    public static int doMax(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int doCount(int[] a) {
        int max = doMax(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                count++;
            }
        }
        return count;
    }
}

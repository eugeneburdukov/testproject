package Six;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(doSum(array));
    }

    public static int doSum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != doMin(a) && a[i] != doMax(a)) {
                sum = sum + a[i];
            }
        }
        return sum;
    }

    public static int doMin(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static int doMax(int[] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min < a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}

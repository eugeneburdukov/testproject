package Six;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        if (doDuplicateCheck(array) == true) {
            doDuplicate(array);
        } else {
            System.out.println("NO");
        }

    }


    public static boolean doDuplicateCheck(int[] a) {
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void doDuplicate(int[] a) {
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    duplicates.add(a[j]);
                }
            }
        }
        for (Integer x : duplicates) {
            System.out.print(x + " ");
        }
    }
}

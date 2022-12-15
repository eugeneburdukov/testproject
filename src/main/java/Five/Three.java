package Five;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        //Усі OK
        //Задано натуральне число n. Порахуйте і виведіть повідомлення OK як показано у прикладі.
        //Вхідні дані
        //Одне натуральне число n (n ≤ 100).
        //Вихідні дані
        //Вивести n раз прономерований текст OK в стовпчик.

        print(doInitialize());
    }

    public static int[] doInitialize() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        return array;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + 1 + " OK");
        }
    }
}

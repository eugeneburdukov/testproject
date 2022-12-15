package Five;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        //Модуль максимального
        //
        //Задана послідовність дійсних чисел. Обчислимо їх модулі. Знайдіть максимальне значення серед цих модулей.
        //
        //Вхідні дані
        //
        //У першому рядку задано кількість елементів n (n ≤ 100) у послідовності. У наступному рядку задано n дійсних чисел - елементи послідовності, значення яких не первищують за модулем 100.
        //
        //Вихідні дані
        //
        //Виведіть максимальне значення серед цих модулей з 2 десятковими знаками.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double[] array = new double[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -1 * array[i];
            }
        }

        System.out.printf("%.2f", maxNumber(array));


    }

    public static double maxNumber(double[] a){
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}

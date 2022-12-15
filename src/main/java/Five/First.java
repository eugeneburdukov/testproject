package Five;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //Ті, що діляться на 6
        //
        //Для n цілих чисел визначити суму й кількість додатніх чисел, які діляться на 6 без остачі.
        //
        //Вхідні дані
        //
        //У першому рядку задано кількість чисел n (0 < n ≤ 100), у наступному рядку задано самі числа, значення яких по модулю не перевищують 10000.
        //
        //Вихідні дані
        //
        //Виведіть кількість вказаних чисел та їх суму.


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 6 == 0 && array[i] > 0) {
                sum = sum + array[i];
                count++;
            }
        }
        System.out.println(count + " " + sum);
    }
}

package Five;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        //Марафон 2
        //Учасникам забігу надали номери від a до b та занесли цю інформацію до комп'ютера. Виведіть номери спортсменів.
        //
        //Вхідні дані
        //Два натуральних числа a і b (a ≤ b ≤ 1000).
        //
        //Вихідні дані
        //Виведіть номери спортсменів у порядку зростання.
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();

        int[] array = new int[lastNumber - firstNumber + 1];
        array[0] = firstNumber;
        array[array.length - 1] = lastNumber;

        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

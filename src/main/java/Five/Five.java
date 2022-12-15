package Five;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        //Таймер
        //Задано натуральне число n. Змоделюйте зворотній відрахунок таймера від n до 0 як наведено у прикладі.
        //
        //Вхідні дані
        //Одне натуральне число n.
        //
        //Вихідні дані
        //Вивести числа від n до 0 з текстом sek у стовпчик.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i + " sek");
        }
    }
}

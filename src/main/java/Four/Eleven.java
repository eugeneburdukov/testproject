package Four;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        int temp = number;

        for (int i = 1; i < temp; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

//        System.out.println();
//
//        while (number > 0) {
//            if (number % 2 != 0) {
//                System.out.print(number + " ");
//            }
//            number = number - 1;
//        }

    }
}

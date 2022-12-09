package Four;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isCalc(number) == true) {
            System.out.println((int) Math.pow(number, 2));
        } else {
            while (isCalc(number) == false) {
                number++;
            }

            System.out.println(number);
        }
    }

    public static boolean isCalc(int number) {
        boolean flag = false;

        while (number != 2 && number % 2 == 0) {
            number = number / 2;
        }

        if (number == 2) {
            flag = true;
        }
        return flag;
    }
}

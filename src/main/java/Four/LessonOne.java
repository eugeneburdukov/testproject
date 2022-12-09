package Four;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int d = 2;
        int sqrt = (int) Math.sqrt(number);

        while (number % d != 0) {
            d++;
            if (d > sqrt) {
                d = number;
                break;
            }
        }
        System.out.println(d);
    }
}

package Two;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        int countOfTheDigit = countOfTheDigit(number);
        long lastButOneNumber = 0;
        long temp3 = 0;

        long lastNumber = number % 10;

        for (int i = 0; number > 0; i++) {
            if (i == 1) {
                lastButOneNumber = number % 10;
            }
            number = number / 10;
        }
        System.out.println(countOfTheDigit + " " + lastButOneNumber + " " + lastNumber);
    }

    public static int countOfTheDigit(long number){
        int count = 0;
        for (int i = 0; number > 0; i++) {
            number = number / 10;
            count++;
        }
        return count;
    }
    public static int firstDigit(long number){
        long lastNumber = 0;
        for (int i = 0; number > 0; i++) {
            if (number / 10 < 0) {
                lastNumber = number;
            }
        }
        return (int) lastNumber;
    }
}

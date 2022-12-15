package Four;

import java.util.Scanner;

public class SimpleMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int d = 2;
        int sq = (int)Math.round(Math.sqrt(number));

        while (number > 1){
            while (number % d == 0){
                System.out.println(d);
                number = number / d;
            }
            d++;
            if (d > sq) {
                break;
            }
        }
        if (number > 1) {
            System.out.println(number);
        }
    }
}

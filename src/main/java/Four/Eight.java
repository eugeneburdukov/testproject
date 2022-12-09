package Four;

import java.util.Scanner;

public class Eight {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            int positive = 0;

            do {
                number = scanner.nextInt();
                if (number > 0) {
                    positive = positive + number;
                }
            } while (number != 0);

            System.out.println(positive);
        }
}

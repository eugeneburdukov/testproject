package Three;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number % 2 == 0) {
            System.out.println("YES");
        } else if(number < 0 && number % 3 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

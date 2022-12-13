package Four;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 7 == 0) {
            System.out.println(number + 7);
        } else {
            System.out.println(number + 7 - number % 7);
        }


        //if n%7==0:
        //    print(n+7)
        //else:
        //    print(n + 7-n%7)
    }
}

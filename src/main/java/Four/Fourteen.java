package Four;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        int temp = 1;

//        for (int i = 0; i < number; i++) {
//            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
//                System.out.println(i);
//                count++;
//            }
//        }

        while (count < number) {
            if (temp % 2 != 0 && temp % 3 != 0 && temp % 5 != 0) {
                System.out.print(temp + " ");
                count++;
            }
            temp++;
        }
    }
}
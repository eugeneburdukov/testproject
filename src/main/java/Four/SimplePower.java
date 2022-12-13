package Four;

import java.util.Scanner;

public class SimplePower {
    public static void main(String[] args) {
        //Прості множники
        //
        //На вході програми маємо натуральне число n (n>1). Потрібно розкласти його на прості множники.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 0){
            if (number % 2 == 0) {
                number = number / 2;
                System.out.println(2);
            } else if(number % 3 == 0){
                number = number / 3;
                System.out.println(3);
            } else {
                System.out.println(number);
                break;
            }
        }
    }
}

package Four;

import java.util.Scanner;

public class PowerOfTwo {
    //Програма має ввести з консолі натуральне число n та знайти число наступне за n, що є деяким степенем двійки.
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        powerOfTwo.B();
    }

    private void B() {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long power = 0;
        number++;
        while (true) {
            if ((long) (Math.pow(2, power)) < number) {
                power++;
            } else {
                System.out.println((long) Math.pow(2, power));
                break;
            }
        }
    }
}

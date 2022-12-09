package Four;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        PowerOfTwo main = new PowerOfTwo();
        main.B();
    }

    private void B() {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long st = 0;
        n++; //следующее значит больше!
        while (true) {
            if ((long) (Math.pow(2, st)) < n) {
                st++;
            } else {
                System.out.println((long) Math.pow(2, st));
                break;
            }
        }
    }
}

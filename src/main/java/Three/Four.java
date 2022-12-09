package Three;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c && b < a){
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

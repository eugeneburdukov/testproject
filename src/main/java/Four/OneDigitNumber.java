package Four;

import java.util.Scanner;

public class OneDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        if (number >= -9 && number <= 9) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }


        //var x: integer;
        //begin
        //  readln(x);
        //  if(x >= -9) and (x <= 9) then
        //    writeln('Ok')
        //  else
        //    writeln('No')
        //end.


    }
}

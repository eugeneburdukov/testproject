package Four;

public class Seventeen {
    public static void main(String[] args) {

        int number = 12345;
        int result = 0;

        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number = number / 10;
        }

        System.out.println(result);

    }
}

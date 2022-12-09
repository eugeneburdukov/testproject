package One;

import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {
        doCalculate();
    }

    public static void doCalculate() {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'A'
                    || word.charAt(i) == 'E'
                    || word.charAt(i) == 'I'
                    || word.charAt(i) == 'O'
                    || word.charAt(i) == 'U'
                    || word.charAt(i) == 'Y') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

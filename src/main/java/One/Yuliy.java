package One;

import java.util.Scanner;

public class Yuliy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int k = scanner.nextInt();

        String resultWord = word;

        for (int i = 0; i < word.length(); i++) {
            word = word.substring(0, i) + (char) (word.charAt(i) - k) + word.substring(i + 1);
        }

        System.out.println(word);

    }
}

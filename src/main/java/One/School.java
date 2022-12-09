package One;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        storeDatabase();
    }

    public static void storeDatabase() {
        Map<Integer, String> ratings = new HashMap<>();
        ratings.put(1, "Initial");
        ratings.put(2, "Initial");
        ratings.put(3, "Initial");
        ratings.put(4, "Average");
        ratings.put(5, "Average");
        ratings.put(6, "Average");
        ratings.put(7, "Sufficient");
        ratings.put(8, "Sufficient");
        ratings.put(9, "Sufficient");
        ratings.put(10, "High");
        ratings.put(11, "High");
        ratings.put(12, "High");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (Map.Entry<Integer, String> entry : ratings.entrySet()) {
            if (entry.getKey().equals(number)) {
                System.out.println(entry.getValue());
            }
        }
    }
}

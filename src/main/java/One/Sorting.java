package One;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = new int[]{83, 82, 84, 89, 85, 90, 81, 86, 87, 80, 113, 352, 503, 351, 501, 353, 497, 352, 364, 351, 362, 353, 363, 385, 386, 96, 119, 118, 115, 114, 117, 113, 120, 116, 1333, 1331, 1331, 1329};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

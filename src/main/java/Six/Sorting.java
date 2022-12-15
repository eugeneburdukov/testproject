package Six;

public class Sorting {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 9, 2, 5, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int current = arr[0];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (current == arr[i] && !found) {
                found = true;
            } else if (current != arr[i]) {
                System.out.print(" " + current);
                current = arr[i];
                found = false;
            }
        }
        System.out.print(" " + current);


    }
}

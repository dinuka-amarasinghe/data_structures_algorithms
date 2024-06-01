package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void reverseInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            // Swap item at index [i] with item at index [arr.length - 1 - i]
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Arrays.stream(reverse(arr)).forEach(num -> System.out.print(num + " "));

        System.out.println();

        reverseInPlace(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));

        System.out.println();

        reverseInPlace(arr);
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
    }
}

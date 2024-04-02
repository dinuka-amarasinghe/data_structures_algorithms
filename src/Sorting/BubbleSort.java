package Sorting;

public class BubbleSort {

    private static void bubbleSort(int[] array) {
        boolean isSwapped = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
            System.out.println("Sorting Iteration: " + (i + 1));
            printArray(array);
        }
    }

    public static void main(String[] args) {
        int[] unsortedArray = {13, 2, 21, 3, 1, 8, 5};

        System.out.println("Unsorted Array: ");
        printArray(unsortedArray);

        bubbleSort(unsortedArray);

        System.out.println("Sorted Array: ");
        printArray(unsortedArray);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
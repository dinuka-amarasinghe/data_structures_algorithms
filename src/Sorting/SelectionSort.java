package Sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    // Method to perform selection sort on an array of numbers
    private static void selectionSort(int[] numbers) {
        int length = numbers.length;

        // Iterate through the array
        for (int i = 0; i < length - 1; i++) {
            // Assume the current element is the minimum
            int min = numbers[i];
            int indexOfMin = i;

            // Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }

            // Swap the current element with the minimum element found
            swap(numbers, i, indexOfMin);
        }
    }

    // Method to swap two elements in an array
    private static void swap(int[] numbers, int i, int indexOfMin) {
        int temp = numbers[i];
        numbers[i] = numbers[indexOfMin];
        numbers[indexOfMin] = temp;
    }

    public static void main(String[] args) {
        // Create an array of 10 numbers
        int[] numbers = new int[10];
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        // Print the unsorted array
        System.out.println(Arrays.toString(numbers));

        // Sort the array using selection sort
        selectionSort(numbers);

        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
    }
}

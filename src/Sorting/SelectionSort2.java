package Sorting;

import java.util.Arrays;

public class SelectionSort2 {

    // Method to perform selection sort
    public static void selectionSort(int[] numbers) {
        // Initialize the index of the last unsorted element
        int lastUnsorted = numbers.length - 1;

        // Iterate until there are elements to be sorted
        while (lastUnsorted > 0) {
            // Initialize variables to keep track of the maximum value and its index
            int maxIndex = 0;
            int maxValue = numbers[0];

            // Iterate through the unsorted portion of the array to find the maximum value and its index
            for (int i = 1; i <= lastUnsorted; i++) {
                if (numbers[i] > maxValue) {
                    maxValue = numbers[i];
                    maxIndex = i;
                }
            }

            // Swap the maximum value with the last unsorted element
            numbers[maxIndex] = numbers[lastUnsorted];
            numbers[lastUnsorted] = maxValue;

            // Decrement the index of the last unsorted element
            lastUnsorted--;
        }
    }

    // Main method to demonstrate the sorting functionality
    public static void main(String[] args) {
        // Initialize an array of numbers
        int[] numbers = {5, 4, 8, 9, 3, 13, 7};

        // Print the unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(numbers));

        // Sort the array using selection sort
        selectionSort(numbers);

        // Print the sorted array
        System.out.println();
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}

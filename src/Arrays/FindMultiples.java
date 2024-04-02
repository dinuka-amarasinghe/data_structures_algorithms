package Arrays;

import java.util.Arrays;
import java.util.Random;

public class FindMultiples {
    /*
     *Find an index where a value in the array occurs for the second time
     * Returns -1 if no such index exists
     */
    public static int findDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    /*
     * Find an index where a value in the array occurs for the third time
     * Returns -1 if no such index exists
     */
    public static int findTriplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;  // Count the occurrences of the current number
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    if (count == 2) {
                        return i;  // Found the third occurrence
                    }
                }
            }
        }
        return -1;  // No index with the third occurrence found
    }


    /*
     * Find an index where a value in the sorted array occurs for the second time
     * Returns -1 if no such index exists
     */
    public static int findDuplicateSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                return i;
            }
        }
        return -1;  // Failure case
    }


    /*
     * Find an index where a value in the sorted array occurs for the third time
     * Returns -1 if no such index exists
     */
    public static int findTriplicateSorted(int[] numbers) {
        int count = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;  // Failure case
    }

    /*
     * Generates an array of the given size, containing random values
     * Range of numbers is bounded either by howMany or howMany*sqrt(howMany)
     */
    public static int[] randomValues(int howMany) {
        int[] result = new int[howMany];
        Random random = new Random();
        for (int i = 0; i < howMany - 2; i++)
            result[i] = i;
        int r = random.nextInt(howMany);
        result[howMany - 1] = r;
        result[howMany - 2] = r;
        for (int range = howMany; range >= 2; range--) {
            int index = random.nextInt(range);
            int temp = result[index];
            result[index] = result[range - 1];
            result[range - 1] = temp;
        }
        return result;
    }


    public static void main(String[] args) {
        // Configuration variables
        int numValues = 100;
        boolean triplicates = false;
        boolean sortData = false;
        boolean printData = true;

        // Generate random data
        int[] data = randomValues(numValues);

        if (sortData) {
            Arrays.sort(data);
        }

        // Print the generated data if needed
        if (printData) {
            System.out.println("Generated Data:");
            System.out.println(Arrays.toString(data));
        }

        // Find duplicates or triplicates based on configuration
        long startTime = System.currentTimeMillis();
        int resultIndex = -1;
        if (triplicates) {
            if (sortData) {
                resultIndex = findTriplicateSorted(data);
            } else {
                resultIndex = findTriplicate(data);
            }
        } else {
            if (sortData) {
                resultIndex = findDuplicateSorted(data);
            } else {
                resultIndex = findDuplicate(data);
            }
        }
        long endTime = System.currentTimeMillis();

        // Calculate elapsed time
        double elapsedTimeSeconds = (endTime - startTime) / 1000.0;

        // Display results
        if (resultIndex >= 0) {
            System.out.println("Duplicate/Triplicate Found at Index: " + resultIndex);
            System.out.println("Value: " + data[resultIndex]);
        } else {
            System.out.println("No Duplicate/Triplicate Found.");
        }
        System.out.println("Elapsed Time: " + elapsedTimeSeconds + " seconds");
    }
}

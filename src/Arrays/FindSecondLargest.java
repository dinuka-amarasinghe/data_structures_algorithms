package Arrays;

public class FindSecondLargest {

    public static void findSecondLargest(int[] arr) {
        // Check if array has at least 2 elements to find second largest
        if (arr.length < 2) {
            System.out.println("Second largest number does not exist.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean allSame = true;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                allSame = false;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if all array elements are same
        if (allSame || secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest number does not exist.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 20, 40, 40};
        findSecondLargest(numbers);
    }
}


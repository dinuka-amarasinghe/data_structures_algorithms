package Searching;

public class BinarySearchIterative {

    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int middle = (left + right) / 2;

            if(array[middle] == target)
                return middle;

            if(target < array[middle])
                right = middle - 1;
            else
                left = middle +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,7};
        BinarySearchIterative binarySearchIterative = new BinarySearchIterative();
        int index = binarySearchIterative.binarySearch(numbers, 6);
        System.out.println(index);
    }
}

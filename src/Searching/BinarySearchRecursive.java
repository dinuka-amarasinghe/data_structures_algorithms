package Searching;

public class BinarySearchRecursive {

    public int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array,target,0,array.length-1);
    }

    private int binarySearchRec(int[] array, int target, int left, int right) {

        if(right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchRec(array, target, left, middle-1);

        return binarySearchRec(array, target, middle +1, right);
    }


    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,7};
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        int index = binarySearchRecursive.binarySearchRec(numbers,1);
        System.out.println(index);
    }
}

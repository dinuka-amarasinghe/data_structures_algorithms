package Searching;

public class LinearSearch {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {7,1,3,6,5};
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearch(numbers,8));
    }
}

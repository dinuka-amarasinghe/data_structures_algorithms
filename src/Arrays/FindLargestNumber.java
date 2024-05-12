package Arrays;

public class FindLargestNumber {

    private static int findLargestNumber(int[] numbers) {
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest)
                largest = numbers[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findLargestNumber(numbers));
    }
}

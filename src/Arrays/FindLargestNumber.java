package Arrays;

public class FindLargestNumber {

    private static int findLargestNumber(int[] numbers) {
        if(numbers.length == 0)
            throw new IllegalArgumentException("Array is empty");
        else {
            int largest = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] > largest)
                    largest = numbers[i];
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {};
        System.out.println(findLargestNumber(numbers));
    }
}

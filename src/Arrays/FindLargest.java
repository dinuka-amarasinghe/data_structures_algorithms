package Arrays;

public class FindLargest {

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
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(findLargestNumber(numbers));
    }
}

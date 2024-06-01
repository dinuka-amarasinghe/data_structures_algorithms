package Arrays;

public class RotateArray {

    private static int[] rotateArray(int[] numbers) {
        if(numbers == null || numbers.length < 1) {
            return numbers;
        }

        int[] rotated = new int[numbers.length];
        for(int i = 1; i < numbers.length; i++) {
            rotated[i-1] = numbers[i];
        }
        rotated[rotated.length - 1] = numbers[0];
        return rotated;
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int[] result = rotateArray(numbers);

        for(int num: result) {
            System.out.print(num + " ");
        }
    }
}

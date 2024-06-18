package Arrays;

import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {

    static int getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;
        if (n < 2) {
            throw new IllegalArgumentException("The array should contain at least two elements.");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Please enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Answer: " + getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

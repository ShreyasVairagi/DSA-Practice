package problems;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] numbers){

        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int[] ans = new int[numbers.length];

        ans[0] = 1;
        for (int i = 1; i < numbers.length; i++){
            ans[i] = ans[i - 1] * numbers[i - 1];
        }

        int rightProduct = 1;
        for (int i = numbers.length-1; i >= 0; i--){
            ans[i] = ans[i] * rightProduct;
            rightProduct *= numbers[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] result = productExceptSelf(numbers);

        // This will print the left-pass array: [1, 1, 2, 6]
        System.out.println("Left pass result: " + Arrays.toString(result));
    }
}

package problems;

import java.util.Arrays;

public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] numbers) {

        int sum = 0;
        int higestSum = numbers[0];

        for (int i: numbers){
            sum += i;
            if(sum > higestSum){
                higestSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return higestSum;

    }

    public static void main(String[] args) {
        // Test case 1: Mixed positive and negative numbers
        int[] numbers1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Test case 2: Mostly positive numbers
        int[] numbers2 = {1, 2, 3, -2, 5};

        // Test case 3: All negative numbers
        int[] numbers3 = {-1, -2, -3, -4};

        // Print results
        System.out.println("Array: " + Arrays.toString(numbers1) + " | Max Sum: " + maxSubarraySum(numbers1));
        System.out.println("Array: " + Arrays.toString(numbers2) + " | Max Sum: " + maxSubarraySum(numbers2));
        System.out.println("Array: " + Arrays.toString(numbers3) + " | Max Sum: " + maxSubarraySum(numbers3));
    }
}
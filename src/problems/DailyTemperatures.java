package problems;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        if (temperatures == null || temperatures.length == 0) {
            return new int[0];
        }

        int[] tempArr = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int pastIndex = stack.pop();
                tempArr[pastIndex] = i - pastIndex;
            }
            stack.push(i);
        }
        return tempArr;
    }

    public static void main(String[] args) {
        // Sample input temperatures
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        // Call the method
        int[] result = dailyTemperatures(temperatures);

        // Print the results clearly
        System.out.println("Input Temperatures: " + Arrays.toString(temperatures));
        System.out.println("Days Until Warmer:  " + Arrays.toString(result));
    }
}

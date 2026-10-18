package hashing;

import java.util.HashMap;


public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int valueNeeded = target - numbers[i];

            if (hashMap.containsKey(valueNeeded)) {
                return new int[] { hashMap.get(valueNeeded), i };
            }
            hashMap.put(numbers[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(numbers,target));

    }
}

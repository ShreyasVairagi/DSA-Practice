package problems;

import java.util.HashMap;

public class CountSubarraysWithSum {
    public static int countSubarrays(int[] numbers, int target){
        int currentSum = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);

        for(int i : numbers){
            currentSum += i;
            int needed = currentSum - target;
            if(hashMap.containsKey(needed)){
                count += hashMap.get(needed);
            }
            hashMap.put(currentSum, hashMap.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 2};
        int target = 3;

        int result = countSubarrays(numbers, target);
        System.out.println("Total subarrays found: " + result); // Expected: 2 ([1, 2] and [3])
    }
}

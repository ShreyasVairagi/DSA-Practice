package problems;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] numbers){

        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : numbers){
            hashSet.add(i);
        }

        int length = 0;

        for (int i : hashSet) {
            if (!hashSet.contains(i - 1)) {
                int currentNum = i;
                int currentStreak = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                length = Math.max(length, currentStreak);
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] numbers = {100, 4, 200, 1, 3, 2};
        System.out.println("Result: " + longestConsecutive(numbers));
    }
}

package problems;

public class MinSubarrayLength {
    public static int minSubarrayLength(int[] numbers, int target){
        int left = 0;
        int right = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        while (right < numbers.length){
            windowSum += numbers[right];
            right++;

            while (windowSum >= target){
                int currentLength = right - left;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                windowSum -= numbers[left];
                left++;
            }

        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}

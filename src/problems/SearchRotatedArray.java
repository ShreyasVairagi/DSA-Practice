package problems;

public class SearchRotatedArray {
    public static int search(int[] numbers, int target){
        if(numbers.length == 0){
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right){
            int half = left + (right - left) / 2;
            if(numbers[half] == target){
                return half;
            }

            if (numbers[left] <= numbers[half]) {
                if (numbers[left] <= target && target < numbers[half]) {
                    right = half - 1;
                } else {
                    left = half + 1;
                }
            }
            else {
                if (numbers[half] < target && target <= numbers[right]) {
                    left = half + 1;
                } else {
                    right = half - 1;
                }
            }
        }
        return -1;
    }
}

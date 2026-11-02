package problems;

public class FindMinimumRotatedArray {
    public static int findMin(int[] numbers){
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return numbers[left];
    }
}

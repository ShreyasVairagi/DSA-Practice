package problems;

public class FindFirstAndLastPosition {

    public static int[] searchRange(int[] numbers, int target) {
        int[] answer = {-1, -1};
        if (numbers == null || numbers.length == 0) {
            return answer;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                answer[0] = mid;
                right = mid - 1;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                answer[1] = mid;
                left = mid + 1;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}

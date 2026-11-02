package problems;

public class SearchInsertPosition {
    public static int searchInsert(int[] numbers, int target){
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
            if (numbers[half] < target) {
                left = half + 1;
            } else if (numbers[half] > target) {
                right = half - 1;
            }
        }

        return left;

    }

    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 50};

        int target = 45;

        int result = searchInsert(numbers, target);

        System.out.println(result);
    }
}

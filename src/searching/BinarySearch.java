package searching;

public class BinarySearch {

    public static int binarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right){
            int middle  = (left + right) / 2;

            if (numbers[middle] == target){
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else if (numbers[middle] > target) {
                right = middle - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 50};

        int target = 45;

        int result = binarySearch(numbers, target);

        System.out.println(result);
    }
}
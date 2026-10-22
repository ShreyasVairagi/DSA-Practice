package problems;

public class TwoSumSorted {
    public static boolean hasPairWithSum(int[] numbers, int target){
        int right = numbers.length -1;
        int left = 0;

        while (left < right){
            if(numbers[left] + numbers[right] < target){
                left++;
            }else if(numbers[left] + numbers[right] > target) {
                right --;
            }else if (numbers[left] + numbers[right] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] sortedArray1 = {2, 4, 6, 8, 10};
        int target1 = 10;
        System.out.println("Test 1 Result: " + hasPairWithSum(sortedArray1, target1));
        int[] sortedArray2 = {1, 2, 3, 9};
        int target2 = 8;
        System.out.println("Test 2 Result: " + hasPairWithSum(sortedArray2, target2));
    }
}

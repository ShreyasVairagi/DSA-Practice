package problems;

public class RotateArray {
    public static void rotate(int[] numbers, int k){
        if (numbers == null || numbers.length <= 1) {
            return;
        }

        k = k % numbers.length;
        if (k == 0) return;

        int left = 0;
        int right = numbers.length - 1;
        reverse(numbers, left, right);

        right = k - 1;
        reverse(numbers, left, right);

        left = k;
        right = numbers.length - 1;
        reverse(numbers, left, right);
    }

    private static void reverse(int[] numbers, int left, int right){
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        rotate(numbers, 2);

        System.out.println(java.util.Arrays.toString(numbers));
    }
}

package searching;

public class LinearSearch {

    public static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 3};
        int target = 20;
        int result = linearSearch(numbers, target);
        System.out.println(result);
    }
}
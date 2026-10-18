package problems;

public class PrefixSum {
    public static int[] buildPrefixSum(int[] numbers){
        int[] sum = new int[numbers.length];
        int sumValues = 0;

        for (int i = 0; i < numbers.length; i++){
            sumValues += numbers[i];
            sum[i] = sumValues;
        }
        return sum;
    }

    public static int rangeSum(int[] prefixSum, int left, int right){
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right]- prefixSum[left-1];
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 1, 3, 5};
        int[] prefixSum = buildPrefixSum(numbers);

        System.out.println("rangeSum(1, 3): " + rangeSum(prefixSum, 1, 3));
        System.out.println("rangeSum(2, 4): " + rangeSum(prefixSum, 2, 4));
        System.out.println("rangeSum(0, 2): " + rangeSum(prefixSum, 0, 2));
        System.out.println("rangeSum(3, 3): " + rangeSum(prefixSum, 3, 3));
    }
}

package problems;

public class CountInversions {
    public static int countInversions(int[] numbers){

        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static int countInversionsEfficient(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return 0;
        }
        int[] cloneArray = numbers.clone();
        return mergeSort(cloneArray, 0, cloneArray.length - 1);
    }

    public static int mergeSort(int[] numbers, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int middle = left + (right - left) / 2;

        int count = 0;
        count += mergeSort(numbers, left, middle);
        count += mergeSort(numbers, middle + 1, right);
        count += merge(numbers, left, middle, right);

        return count;
    }

    public static int merge(int[] numbers, int left, int middle, int right) {
        int count = 0;
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = numbers[left + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = numbers[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
                count += (leftSize - i);
            }
            k++;
        }

        while (i < leftSize) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] test1 = {3, 1, 2};
        System.out.println("Test 1: Result = " + countInversions(test1) + " (Expected: 2)");
        System.out.println("Test 1: Result = " + countInversionsEfficient(test1) + " (Expected: 2)");

        int[] test2 = {1, 2, 3};
        System.out.println("Test 2: Result = " + countInversions(test2) + " (Expected: 0)");
        System.out.println("Test 1: Result = " + countInversionsEfficient(test2) + " (Expected: 0)");

        int[] test3 = {3, 2, 1};
        System.out.println("Test 3: Result = " + countInversions(test3) + " (Expected: 3)");
        System.out.println("Test 1: Result = " + countInversionsEfficient(test3) + " (Expected: 3)");

        int[] test4 = {2, 2, 1};
        System.out.println("Test 4: Result = " + countInversions(test4) + " (Expected: 2)");
        System.out.println("Test 1: Result = " + countInversionsEfficient(test4) + " (Expected: 2)");

        int[] test5 = {};
        System.out.println("Test 5: Result = " + countInversions(test5) + " (Expected: 0)");
        System.out.println("Test 1: Result = " + countInversionsEfficient(test5) + " (Expected: 0)");
    }
}
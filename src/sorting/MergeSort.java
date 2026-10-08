package sorting;

public class MergeSort {

    public static void mergeSort(int[] numbers, int left, int right) {

        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergeSort(numbers, left, middle);
        mergeSort(numbers, middle + 1 , right);

        merge(numbers, left, middle, right);
    }

    public static void merge(int[] numbers, int left, int middle, int right) {

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
    }

    public static void main(String[] args) {

        int[] numbers = {8, 3, 5, 4, 7, 6, 1, 2};

        mergeSort(numbers, 0, numbers.length - 1);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
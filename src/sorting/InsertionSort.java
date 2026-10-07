package sorting;

public class InsertionSort {

    public static void insertionSort(int[] numbers) {

        for (int i = 1; i < numbers.length; i++){
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key){
                numbers[j +1] = numbers[j];
                j--;
            }

            numbers[j+1] = key;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2};

        insertionSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
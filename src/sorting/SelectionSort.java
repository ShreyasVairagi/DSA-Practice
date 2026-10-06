package sorting;

public class SelectionSort {

    public static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++){
            int smallestIndex = i;
            for (int j = i+1; j< numbers.length; j++){
                if (numbers[j] < numbers[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;

        }
    }

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2};

        selectionSort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
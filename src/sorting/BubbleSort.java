package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] numbers) {

        int innerSize = numbers.length;
        boolean swapsHappened = false;

        for (int i = 0; i < numbers.length - 1; i++){
            swapsHappened = false;
            for (int j = 0; j < innerSize - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapsHappened = true;
                }
            }
            if (!swapsHappened) {
                break;
            }
            innerSize -= 1;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2};
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {5, 4, 3, 2, 1};
        int[] numbers3 = {7};
        int[] numbers4 = {};

        bubbleSort(numbers);
        bubbleSort(numbers1);
        bubbleSort(numbers2);
        bubbleSort(numbers3);
        bubbleSort(numbers4);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(numbers4));
    }
}
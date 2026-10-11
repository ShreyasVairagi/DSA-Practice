package sorting;

public class QuickSort {

    public static void quickSort(int[] numbers, int low, int high) {
        if (low >= high){
            return;
        }
        int pivotIndex = partition(numbers, low, high);
        quickSort(numbers, low, pivotIndex -1);
        quickSort(numbers, pivotIndex +1 , high);
    }

    public static int partition(int[] numbers, int low, int high){

        int pivot = numbers[high];
        int sortedEnd = low -1;

        for (int i = low; i <= high -1;i++){
            if(numbers[i] <= pivot){
                sortedEnd++;
                int temp = numbers[i];
                numbers[i] = numbers[sortedEnd];
                numbers[sortedEnd] = temp;
            }
        }
        int temp = numbers[sortedEnd + 1];
        numbers[sortedEnd + 1] = numbers[high];
        numbers[high] = temp;

        return sortedEnd +1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        quickSort(numbers, 0, numbers.length - 1);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

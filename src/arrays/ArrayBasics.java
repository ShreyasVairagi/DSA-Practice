package arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 20, 3};

        // A — Print every element
        for (int num : numbers){
            System.out.print(num + " ");
        }

        // B — Print the array length
        System.out.println();
        System.out.println("Length: " + numbers.length);

        // C — Print the first and last elements
        System.out.println("First: " + numbers[0]);
        System.out.println("Last: " + numbers[numbers.length -1]);

        // D — Calculate the sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // E — Find the largest number
        int largest = numbers[0];
        for (int num : numbers) {
            if(num > largest){
                largest = num;
            }
        }
        System.out.println("Largest: " + largest);
    }
}
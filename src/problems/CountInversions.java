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

    public static void main(String[] args) {

        int[] test1 = {3, 1, 2};
        System.out.println("Test 1: Result = " + countInversions(test1) + " (Expected: 2)");

        int[] test2 = {1, 2, 3};
        System.out.println("Test 2: Result = " + countInversions(test2) + " (Expected: 0)");

        int[] test3 = {3, 2, 1};
        System.out.println("Test 3: Result = " + countInversions(test3) + " (Expected: 3)");

        int[] test4 = {2, 2, 1};
        System.out.println("Test 4: Result = " + countInversions(test4) + " (Expected: 2)");

        int[] test5 = {};
        System.out.println("Test 5: Result = " + countInversions(test5) + " (Expected: 0)");
    }
}
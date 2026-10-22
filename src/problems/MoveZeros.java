package problems;

public class MoveZeros {
    public static void moveZeros(int[] numbers){
        int size = numbers.length;
        int insertIndex = 0;

        for(int i = 0; i < size; i++){
            if (numbers[i] != 0){
                numbers[insertIndex] = numbers[i];
                insertIndex++;
            }
        }
        for(int i = insertIndex; i < size; i++){
            numbers[i] = 0;
        }
    }
}

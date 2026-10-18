package hashing;

import java.util.HashSet;

public class FirstDuplicate {

    public static int firstDuplicate(int[] numbers){
        int ans = -1;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : numbers) {
            if(!hashSet.contains(i)){
                hashSet.add(i);
            }else {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 3, 9, 5};
        System.out.println(firstDuplicate(numbers));

    }
}

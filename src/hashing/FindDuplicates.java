package hashing;
import java.util.HashSet;

public class FindDuplicates {
    public static HashSet<Integer> findDuplicates(int[] numbers){
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i : numbers) {
            if(!hashSet.contains(i)){
                hashSet.add(i);
            }else {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 2, 7, 2, 4, 9, 2, 7};
        System.out.println(findDuplicates(numbers));

    }
}

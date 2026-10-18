package hashing;

import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 4, 9, 2};
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : numbers) {
            hashSet.add(i);
        }

        System.out.println(hashSet);
        System.out.println(hashSet.contains(7));
        System.out.println(hashSet.contains(5));
        System.out.println(hashSet.size());
    }
}
package hashing;

import java.util.HashMap;

public class HashMapFrequency {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 4, 9, 2};
        HashMap< Integer, Integer> hashMap = new HashMap<>();

        for (int i : numbers) {
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i) + 1);
                //hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
            }else {
                hashMap.put(i,1);
            }
        }

        System.out.println(hashMap);
    }
}

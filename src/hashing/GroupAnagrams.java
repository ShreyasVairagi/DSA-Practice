package hashing;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] words){
        HashMap<String, ArrayList<String>> hashMap= new HashMap<>();

        for (String i : words){
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if(hashMap.containsKey(key)){
                hashMap.get(key).add(i);
            }else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(i);
                hashMap.put(key, newList);
            }

        }

        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {
        // 1. Empty input array
        String[] test1 = {};
        System.out.println("Empty array test: " + groupAnagrams(test1));

        // 2. Single word
        String[] test2 = {"hello"};
        System.out.println("Single word test: " + groupAnagrams(test2));

        // 3. Repeated identical words
        String[] test3 = {"eat", "eat", "tea"};
        System.out.println("Repeated words test: " + groupAnagrams(test3));

        // 4. Words with different letters
        String[] test4 = {"abc", "def"};
        System.out.println("Different letters test: " + groupAnagrams(test4));
    }
}

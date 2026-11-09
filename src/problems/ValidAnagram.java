package problems;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> count = new HashMap<>();
        boolean ans = true;

        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++){
            if (!count.containsKey(t.charAt(i))){
                return false;
            }
            int updatedCount = count.get(t.charAt(i)) - 1;
            if (updatedCount < 0) {
                return false;
            }
            count.put(t.charAt(i), updatedCount);
        }


        return ans;

    }
}

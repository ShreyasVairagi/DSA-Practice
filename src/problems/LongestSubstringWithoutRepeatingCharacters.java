package problems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
        if (s == null || s.isEmpty()) { return 0; }

        int longestSubstring = 0;
        int j = 0;

        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            while (characters.contains(currentChar)) {
                characters.remove(s.charAt(j));
                j++;
            }

            characters.add(currentChar);
            longestSubstring = Math.max(longestSubstring, i - j + 1);
        }

        return longestSubstring;

    }

}

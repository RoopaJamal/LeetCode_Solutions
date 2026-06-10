import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            int r = i;
            while (r < s.length()) {
                if (set.contains(s.charAt(r))) {
                    break; 
                }
                set.add(s.charAt(r));
                r++;
            }
            maxLength = Math.max(maxLength, set.size());
        }  
        return maxLength;
    }
}

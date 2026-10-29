
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[65536];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (lastSeen[ch] > left) {
                left = lastSeen[ch];
            }

            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen[ch] = right + 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(solution.lengthOfLongestSubstring(""));         // 0
    }
}
 {
    
}

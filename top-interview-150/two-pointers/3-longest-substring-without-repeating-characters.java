//QN: https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < n; right ++) {
            
            char current = s.charAt(right);
            if (!set.contains(current)) { // duplicate
                set.add(current);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {

                while (set.contains(current)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(current);
            }
        }

        return maxLength;

    //     HashMap<Character, Integer> hm = new HashMap<>();
        
    //     if (s.length() == 0 ) {
    //         return 0;
    //     }

    //     int start = 0;
    //     int maxLength = 0;

    //     for (int i = 0; i < s.length(); i++) {
    //         char curr = s.charAt(i);
    //         if (hm.containsKey(curr)) {// found duplicate

    //             start = Math.max(start, hm.get(curr) + 1);
    //         }

    //         hm.put(curr, i);

    //         // Calculate the maximum length
    //         maxLength = Math.max(maxLength, i - start + 1);
    //     }
    //     return maxLength;

    


    }
}
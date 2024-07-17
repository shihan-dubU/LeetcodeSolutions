//QN : https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }

        int sCounter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sCounter)) {
                //found a character match, look for next letter in subsequence
                sCounter ++;
            }

            if (sCounter == s.length()) {
                //terminate once we find all letters of the subsequence
                return true;
            }
        }
        return false;
    }
}
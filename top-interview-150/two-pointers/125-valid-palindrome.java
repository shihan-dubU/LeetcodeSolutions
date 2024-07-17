//QN : https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        int front = 0;
        int back = s.length() -1;

        while (front < back) { 
            // we can ignore the case where front == back, because middle alphabet doesnt matter
            if (s.charAt(front) != s.charAt(back)) {
                return false;
            }
            front ++;
            back --;
        }

        return true;
    }
}
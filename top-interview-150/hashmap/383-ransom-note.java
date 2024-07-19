//qn https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        } else if (ransomNote.length() == 0) {
            return true;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i =0; i < magazine.length(); i++) {
            char curr = magazine.charAt(i);
            if (! hm.containsKey(curr) ){
                hm.put(curr, 1);
            } else {
                hm.put(curr, hm.get(curr) + 1);
            }
        }

        for (int i =0; i < ransomNote.length(); i++) {
            char curr = ransomNote.charAt(i);
            if (! hm.containsKey(curr) || hm.get(curr) <= 0 ){
                return false;
            } else {
                hm.put(curr, hm.get(curr)-1);
            }
        }

        return true;
    }
}
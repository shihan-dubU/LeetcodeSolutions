//QN: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int next;
        int sorted = 0;
        int count = 1;

        boolean firstDupe = true;

        for (int i = 1; i < nums.length; i++) {
            next = nums[i];
            
            if (nums[sorted] == next) { //found duplicate
                if (firstDupe) {
                    firstDupe = false;
                    count ++;
                    sorted ++;
                    nums[sorted] = next;
                } 
            } else { //no duplicate
                firstDupe = true;
                count ++;
                sorted ++;
                nums[sorted] = next;
            } 
        }
        return count;
    }
}
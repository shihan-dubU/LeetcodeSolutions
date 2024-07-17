//QN: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int next;
        int sorted = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            next = nums[i];
            if (nums[sorted] != next) { //detect duplicate
                count ++;
                sorted ++;
                nums[sorted] = next;
            } 
        }
        return count;
    }
}
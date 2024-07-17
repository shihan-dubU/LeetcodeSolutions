//QN: https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;

        if (size == 1) {
            return nums[0];
        }
        int half = nums.length/2;
        Integer curr, val;
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        for (int i =0; i < size; i++) {
            curr = nums[i];
            val = count.get(curr);

            if (val == null) {
                count.put(curr, 1); 
            } else {
                val++;
                if (val > half) {
                    return curr;
                }
                count.put(curr, val);
                
            }
        }
        return -1;
    }
}
//QN: https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        if (nums.length == 0) {
            return new LinkedList<String>();
        } 
        int start = nums[0];

        List<String> result = new LinkedList<String>();

        if (nums.length == 1) {
            result.add(String.valueOf(start));
            return result;
        }

        for (int i = 1; i < nums.length; i++) {
    
            if (!(nums[i] == nums[i-1] + 1)) { //non consecutive, append set to list
                result.add(generateOutput(start, nums[i-1]));
                start = nums[i];
            } 

            if ( i == nums.length -1) { //we need to "flush" the last result out
                result.add(generateOutput(start, nums[i]));
            }
            
        }

        return result;
    }

    public String generateOutput(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return "" + start + "->" + end;
    }
}
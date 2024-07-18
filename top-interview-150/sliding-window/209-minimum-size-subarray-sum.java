//QN: https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int front = 0;
        int currlength = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            
            sum += nums[i];
            currlength ++;

            if (sum >= target) {
                //try to strip the excess:
                while (true) {
                    if (sum - nums[front] >= target) {
                        sum -= nums[front];
                        front ++;
                        currlength --;
                    } else {
                        break;
                    }
                }

                //we found a subsection
                if (currlength < min) {   
                    min = currlength;
                }                
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
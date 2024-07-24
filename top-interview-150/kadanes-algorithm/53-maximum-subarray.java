class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int curr = 0;

        for (int num : nums) {
            
            if (curr < 0) {
                curr = 0;
            }

            curr += num;
            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }
}
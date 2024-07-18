//QN: https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean canJump(int[] nums) {
        //gas refers to the furthest we can reach from our current position.
        int gas = nums[0];

        if (nums.length == 1) {
            return true;
        }
        
        for (int i = 0; i < nums.length; i++) {
            //increase gas if we can jump further from current position.
            if (gas < nums[i]) {
                gas = nums[i];
            }

            //ran out of gas
            if (gas == 0) {
                return false;
            }

            //we are able to jump to the end
            if (gas + i >= nums.length -1) {
                return true;
            }
            //reduce gas after incrementing distance
            gas --;
        }

        return false;
    }
}
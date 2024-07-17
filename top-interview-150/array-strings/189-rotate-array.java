//QN: https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int[] temp = new int[k];

        for (int i = 0; i < k ; i++) {
            temp[i] = nums[nums.length -k + i];
        }
        // System.out.println(Arrays.toString(temp));

        for (int i = nums.length - k - 1; i > -1; i--) {
            // System.out.println("i = " + i);
            // System.out.println("nums[i + k - 1] = " + nums[i + k - 1]);
            // System.out.println("nums[i] = " + nums[i]);
            nums[i + k] = nums[i];
        }
        // System.out.println(Arrays.toString(nums));

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        
        
    }
}
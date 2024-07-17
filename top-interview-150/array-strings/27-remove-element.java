//QN : https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int back = nums.length -1;
        int front = 0;
        while (front <= back) {
            if (nums[front] == val) { //if we found a val
                //now we attempt to replace this with a number from the back of the array
                while (front <= back) {
                    if (nums[back] == val) {
                        //the back number is val
                        back --;
                    } else {
                        nums[front] = nums[back];
                        back --;
                        k++;
                        break;
                    }
                }
            }
            else {
                k++;
            }
            front++;
        }
        return k;
    }
}
//QN: https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        return binarySearch(nums, target, 0, nums.length - 1);
        
    }

    public int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            //not found
            return start;
        }

        int middle = (start + end)/2;

        if (middle < 0) {
            return 0;
        } else if (middle >= arr.length) {
            return arr.length;
        }

        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            return binarySearch(arr, target, start, middle - 1);
        } else {
            return binarySearch(arr, target, start + 1, end);
        }
    }
}
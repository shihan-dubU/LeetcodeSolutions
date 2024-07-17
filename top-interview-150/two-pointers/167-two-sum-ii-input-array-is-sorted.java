//QN: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //2 POINTER METHOD
        int front = 0;
        int back = numbers.length - 1;

        while (front < back) {
            int sum = numbers[front] + numbers[back];
            if (sum == target) {
                return new int[]{front + 1, back +1};
            } else if (sum > target) { //if the sum is too big, we reduce "big #"
                back --;
            } else { //if the sum is too small, we increase "small #"
                front ++;
            }
        }
        return new int[2];


        //NESTED LOOP METHOD - slow
        // for (int i = 0; i < numbers.length; i++) {
        //     int value1 = numbers[i];

        //     for (int j = i + 1; j < numbers.length; j++) {
        //         int sum = value1 + numbers[j];
        //         if (sum == target) {
        //             return new int[]{i + 1, j + 1};

        //         } else if (sum > target) {
        //             break;
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
    }
}
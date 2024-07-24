class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        //greedy solution that takes advantage of the idea that
        //global min + global max == total 
        int maxSoFar = 0;
        int minSoFar = 0;

        int globalMax = nums[0];
        int globalMin = nums[0];

        int total = 0;

        for (int num: nums) {
            total += num;

            maxSoFar = Math.max(num, num + maxSoFar);
            if (maxSoFar > globalMax) {
                globalMax = maxSoFar;
            }

            minSoFar = Math.min(num, num + minSoFar);
            if (minSoFar < globalMin) {
                globalMin = minSoFar;
            }
        }

        if (globalMax < 0) { //all negative case
            return globalMax;
        }

        return Math.max(globalMax, total - globalMin);

        //naive solution: 
        // int gigaMaxestOfMaxes = nums[0];

        // if (nums.length == 1) {
        //     return gigaMaxestOfMaxes;
        // }

        // for(int i = 0; i < nums.length; i++) {

        //     int maxSoFar = nums[i];
        //     int maxEndingHere = nums[i];
        //     System.out.println("curr" + maxSoFar);

        //     for(int j = i + 1; j < nums.length; j++) {
        //         int num = nums[j];
        //         maxEndingHere = Math.max(num, num + maxEndingHere);
        //         if (maxEndingHere >= maxSoFar) {
        //             maxSoFar = maxEndingHere;
        //         }
        //     }

        //     for (int k = 0; k < i; k++) {
        //         int num = nums[k];
        //         maxEndingHere = Math.max(num, num + maxEndingHere);
        //         if (maxEndingHere >= maxSoFar) {
        //             maxSoFar = maxEndingHere;
        //         }
        //     }

        //     gigaMaxestOfMaxes = Math.max(gigaMaxestOfMaxes, maxSoFar);

        // }
        
        // return gigaMaxestOfMaxes;
    }
}
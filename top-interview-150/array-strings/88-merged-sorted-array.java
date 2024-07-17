//QN: https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        boolean filln = false;
        
        for (int i = nums1.length - 1; i >= 0; i--) {
            System.out.println("m = " + m);
            System.out.println("n = " + n);

            if (m == 0) { //m is empty, fill n
                filln = true;
                break;
            }
            if (n == 0) {
                break;
            }
            
            if (nums1[m - 1] > nums2[n -1]) {
                nums1[i] = nums1[m-1];
                m --;
            } else {
                nums1[i] = nums2[n-1];
                n--;
            }
       }
       if (filln) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
       }
    }
}
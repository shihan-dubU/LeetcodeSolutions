//QN: https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {

    private Integer prev;
    private int minDiff;
    
    public int getMinimumDifference(TreeNode root) {
        prev = null;
        minDiff = Integer.MAX_VALUE;
        inOrderTraversal(root);
        return minDiff;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) return;

        inOrderTraversal(root.left);


        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }
        //since it is a BST, numbers are sorted. Hence, minimum diff must be between 2 consecutive numbers when we traverse in order
        prev = root.val;

        inOrderTraversal(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
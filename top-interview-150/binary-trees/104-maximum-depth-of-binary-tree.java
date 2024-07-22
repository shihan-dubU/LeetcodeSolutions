//QN : https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxDepth(TreeNode root) {
        //standard recursive BFS
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

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
//QN : https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Recursive BFS approach

        if (p == null) {
            if (q == null) { //both sides are null, hence identical
                return true; 
            }
            return false; //if only one side is null, not identical.
        } else if (q == null) { //if only one side is null, not identical.
            return false;
        }

        if (p.val == q.val) {
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
        } else {
            return false;
        }
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
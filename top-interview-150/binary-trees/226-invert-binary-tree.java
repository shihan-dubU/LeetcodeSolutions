// QN: https://leetcode.com/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayDeque;
class Solution {
    public TreeNode invertTree(TreeNode root) {

        //using Iterative BFS

        //for each node in the queue, swap its children, then add them to the queue.

        if (root == null) {
            return null;
        }
        
        ArrayDeque<TreeNode> q = new ArrayDeque<TreeNode>();
        q.offer(root);
        TreeNode curr;
        TreeNode temp;

        while (!q.isEmpty()) {
            curr= q.poll();
            
            //swap children
            temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            //add children
            if (curr.left != null) {
                q.offer(curr.left);
            }
            if (curr.right != null) {
                q.offer(curr.right);
            }
        }
        return root;
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
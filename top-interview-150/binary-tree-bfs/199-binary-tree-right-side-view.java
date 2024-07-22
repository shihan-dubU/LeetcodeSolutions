//qn: https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayDeque;
import java.util.List;
import java.util.LinkedList;

// Iterative BFS approach
 class Solution {

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

    public class Pair {
        TreeNode node;
        int level;

        Pair(TreeNode root, int level) {
            this.node = root;
            this.level = level;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        //goal: for each level, find the node furthest to the right.

        //The Queue contains arrays with the following format:
        // [val, level]

        ArrayDeque<Pair> q = new ArrayDeque<Pair>();
        
        Pair curr;
        int level = 0;
        List<Integer> result = new LinkedList<Integer>();

        if (root == null) {
            return result;
        }

        q.offer(new Pair(root, level));

        while (!q.isEmpty()) {
            curr = q.poll();

            //add children to queue
            if (curr.node.left != null) {
                q.offer( new Pair(curr.node.left, level + 1) );
            }
            if (curr.node.right != null) {
                q.offer( new Pair(curr.node.right, level + 1) );
            }

            if (q.peek() != null) {
                if (q.peek().level > level) {
                    result.add( curr.node.val );
                    level ++;
                }
            } else {
                result.add(curr.node.val);
            }
        }

        return result;
    }
}
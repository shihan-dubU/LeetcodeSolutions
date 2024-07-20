//QN: https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150

public class Solution {
    public boolean hasCycle(ListNode head) {

        //hashset solution
        // Set<ListNode> set = new HashSet<ListNode>();

        // ListNode curr = head;

        // while (curr != null) {

        //     if (! set.add(curr.next)) {
        //         return true;
        //     }
        //     curr = curr.next;

        // }
        // return false;

        //rabbit and hare implementation

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            try {
                slow = slow.next;
                fast = fast.next.next;
            } catch (NullPointerException e) {
                return false;
            }
            if (slow == fast) {
                return true;
            }  
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
}
}
//QN: https://leetcode.com/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int curr = 0;

        ListNode head = new ListNode();
        ListNode currPos = head;

        while (!(l1 == null && l2 == null)){
            if (l1 != null) {
                curr += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                curr += l2.val;
                l2 = l2.next;
            }

            currPos.val = curr%10;

            if (curr >= 10) {
                curr = 1;
            } else {
                curr = 0;
            }

            if (l1 == null && l2 == null) {
                if (curr == 1) {
                    currPos.next = new ListNode(curr);
                }
                break;
            }
            currPos.next = new ListNode();
            currPos = currPos.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int x) {
        val = x;
        next = null;
        }
    }
}
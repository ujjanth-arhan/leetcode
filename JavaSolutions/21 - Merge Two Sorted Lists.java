/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f1 = list1;
        ListNode f2 = list2;
        ListNode res = new ListNode();
        ListNode resHead = res;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        while(f1 != null || f2 != null) {
            if (f1 == null) {
                res.next = f2;
                res = res.next;
                return resHead.next;
            }

            if (f2 == null) {
                res.next = f1;
                res = res.next;
                return resHead.next;
            }

            if (f1.val < f2.val) {
                res.next = f1;
                res = res.next;
                f1 = f1 == null? null: f1.next;
            }
            else {
                res.next = f2;
                res = res.next;
                f2 = f2 == null? null: f2.next;
            }
        }

        return resHead.next;
    }
}
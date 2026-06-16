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
        ListNode temp = list1;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        else {
            while(temp.next != null) temp = temp.next;
            temp.next = list2;
        }
        ListNode head = list1;
        ListNode t1 = head;
        while(t1 != null) {
            ListNode t2 = head;
            while(t2 != null) {
                if(t1.val < t2.val) {
                    int t = t1.val;
                    t1.val = t2.val;
                    t2.val = t;
                }
                t2 = t2.next;
            }
            t1 = t1.next;
        }
        return head;
    }
}

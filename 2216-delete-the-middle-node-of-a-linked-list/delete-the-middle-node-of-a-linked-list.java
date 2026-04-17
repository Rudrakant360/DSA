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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
       ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
        // ListNode temp = head;
        // int length = 0;
        // while(temp != null){
        //     temp = temp.next;
        //     length++;
        // }
        // if(head == null || head.next == null) return null;
        // temp =head;
        // for(int i =0; i<(length/2)-1;i++){
        //    temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;
    }
}
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
   public ListNode reverse(ListNode head){
      if(head == null || head.next == null) return head;
      ListNode a = head.next;
      head.next = null;
      ListNode b = reverse(a);
      a.next = head;
      return b;
    }
    public void reorderList(ListNode head) {
        ListNode a = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode b = slow.next;
        slow.next = null;    
        b = reverse(b);
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
         while(a!=null && b!=null){
            t.next = a;
            a = a.next;
            t = t.next;

            t.next = b;
            b = b.next;
            t = t.next;
        } 
        if(a != null) t.next = a;
    }
}
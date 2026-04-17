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
    static ListNode reverse(ListNode head){
      if(head == null || head.next == null) return head;
      ListNode a = head.next;
      head.next = null;
      ListNode b = reverse(a);
      a.next = head;
      return b; 
    }
    public boolean isPalindrome(ListNode head) {
     if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode a = head;
        
        while(fast.next != null  && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
      
       ListNode b = reverse(slow.next);
        slow.next = null;
        while(a!= null && b!=null){
            if(a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return true;
    }
}




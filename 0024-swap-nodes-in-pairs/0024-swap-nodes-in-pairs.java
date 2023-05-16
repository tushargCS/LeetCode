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
    public ListNode swapPairs(ListNode head) {
        if(head==null){return null;}
        ListNode prev = null;
        ListNode Next = head.next;
        ListNode curr = head;
        while(Next!=null){
            curr.next = Next.next;
            Next.next = curr;
          
            if(prev==null){head = Next;prev=Next;}
            else{prev.next = Next;}
            
            prev = curr;
            
            curr =curr.next;
           
            if(Next.next==null){break;}
            Next = Next.next;
            if(Next.next==null){break;}
            Next = Next.next;
            if(Next.next==null){break;}
            Next = Next.next;
        }
        
        return head;
    }
}
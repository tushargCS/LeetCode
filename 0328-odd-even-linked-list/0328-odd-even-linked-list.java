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
    public ListNode oddEvenList(ListNode head) {
       if(head==null){
           return head;
       }
        ListNode fast=head;
        ListNode slow=head.next;
        ArrayList<Integer>obj = new ArrayList<>();
        while(fast!=null && fast.next!=null){
            obj.add(fast.val);
            fast=fast.next.next;
        }
        
        if(fast!=null){
            obj.add(fast.val);
        }
        
         while(slow!=null && slow.next!=null){
            obj.add(slow.val);
            slow=slow.next.next;
        }
        
         if(slow!=null){
            obj.add(slow.val);
        }
        
        System.out.println(obj);
        
        
        fast = head;
        int i=0;
        while(fast!=null){
            fast.val=obj.get(i);
            i++;
            fast=fast.next;
        }
        
        return head;
        
    }
}
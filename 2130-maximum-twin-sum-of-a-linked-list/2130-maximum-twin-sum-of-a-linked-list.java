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
    public int pairSum(ListNode head) {
        int i=0;
        ListNode temp = head;
        Stack<Integer> s = new Stack<>(); 
        
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        i = i/2;
       
        temp = head;
        
        while(i>0){
            s.push(temp.val);
            temp = temp.next;
            i--;
        }
         int max=Integer.MIN_VALUE;
        while(temp!=null && !s.empty()){
            if(max<(s.peek()+temp.val)){max=(s.peek()+temp.val);}
             temp = temp.next;
            s.pop();
        }
        
        return max;
    }
}
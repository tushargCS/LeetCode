/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max=0;
    public int longestZigZag(TreeNode root) {
        int t=0;
        fun2(root.left,t);
        fun1(root.right,t);
        return max;
    }
    
    public void fun1(TreeNode root,int t){
        if(root==null){return;}
         t++;
        if(t>max){max=t;}
        fun2(root.left,t);
        t=0;
        fun1(root.right,t);
      
    }
    
    public void fun2(TreeNode root,int t){
        if(root==null){return;}
         t++;
        if(t>max){max=t;}
        fun1(root.right,t);
        t=0;
        fun2(root.left,t);
        
    }
    
}
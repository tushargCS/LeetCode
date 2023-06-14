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
    public int getMinimumDifference(TreeNode root) {
        if(root==null){return 0;}
        fun(root.left,root.val);
        fun(root.right,root.val);
        getMinimumDifference(root.left);
        getMinimumDifference(root.right);
        return min;
    }
    int min = Integer.MAX_VALUE;
    public void fun(TreeNode root,int x){
        if(root==null){return;}
        if(min>Math.abs(x-root.val)){min = Math.abs(x-root.val);}
        fun(root.left,x);
        fun(root.right,x);
 
    }
}
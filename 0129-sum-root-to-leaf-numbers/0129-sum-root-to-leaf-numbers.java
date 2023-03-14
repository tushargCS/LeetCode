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
    int sum=0;
    public int sumNumbers(TreeNode root) {
       return fun(root,1,0);
    }
    public int fun(TreeNode root,int m,int t){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            sum += (t*10 + root.val);
            return sum;
        }
        t = t*10 + root.val; 
        fun(root.left,m,t);
        fun(root.right,m,t);
        return sum;
    }
}
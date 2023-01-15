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
    public TreeNode invertTree(TreeNode root) {
      root =   fun(root);
        return root;
    }
    public TreeNode fun(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode t = fun(root.right);
        root.right = fun(root.left);
        root.left = t;
        
        
        return root;
    }
}
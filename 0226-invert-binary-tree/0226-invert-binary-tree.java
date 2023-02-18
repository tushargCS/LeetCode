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
      TreeNode node =  fun(root);
        return node;
    }
    public TreeNode fun(TreeNode root){
       if(root==null){return null;}
        TreeNode l = fun(root.left);
        TreeNode r = fun(root.right);
        root.left = r;
        root.right = l;
        return root;
    }
}
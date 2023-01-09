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
    List<Integer>obj = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        fun(root);
        return obj;
    }
    
    public void fun(TreeNode root){
        if(root==null){return;}
        obj.add(root.val);
        fun(root.left);
        fun(root.right);
    }
    
}
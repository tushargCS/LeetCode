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
    TreeNode parent=null;
    int ans = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        
       return bst(root);
        
    }
    
    public int bst(TreeNode root){
        if(root.left!=null){
            bst(root.left);
        }
        if(parent!=null){
            ans = Math.min(ans,root.val-parent.val);
        }
        parent = root;
        if(root.right!=null){
            bst(root.right);
        }
        return ans;
    }
}
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
    int f=-1;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){return true;}
        else if(root!=null && f==-1){f = root.val;}
        if(f!=root.val){return false;}
        if(isUnivalTree(root.left)==false){return false;}
        if(isUnivalTree(root.right)==false){return false;}
        return true;
    }
}
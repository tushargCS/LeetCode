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
    TreeNode ret=null;
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode r = pre(root,val);
        return r;
    }
    public TreeNode pre(TreeNode root,int val){
        if(root==null){return null;}
        if(root.val==val){return root;}
        ret = pre(root.left,val);
        if(ret!=null){return ret;}
        ret = pre(root.right,val);
        return ret;
    }
}
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
    public boolean isSymmetric(TreeNode root) {
       return fun(root,root);
    }
    public boolean fun(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){return true;}
        else if(root1==null && root2!=null){return false;}
        else if(root1!=null && root2==null){return false;}
        else if(root1.val!=root2.val){return false;}
       boolean b1 =  fun(root1.left,root2.right);
        if(b1==false){return false;}
       boolean b2 =  fun(root1.right,root2.left);
        if(b2==false){return false;}
        return true;
        
    }
}
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
    String s="";
    public String tree2str(TreeNode root) {
        pre(root);
        return s;
    }
    public void pre(TreeNode root){
        if(root==null){return;}
        s+=String.valueOf(root.val);
        if(root.left!=null){
          s+='(';   
          pre(root.left);
             s+=')';
        }
        else if(root.right!=null){
            s+='(';  
            s+=')';
        }
        
        if(root.right!=null){
            s+='(';
            pre(root.right);
             s+=')';
        }
         else if(root.right!=null){
            s+='(';
             s+=')';
        }
       
    }
}
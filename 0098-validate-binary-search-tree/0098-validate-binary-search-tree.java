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
    ArrayList<Integer> obj = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        fun(root);
        int x = obj.size();
        // for(int v:obj){
        //     System.out.print(v+" ");
        // }
         // System.out.println();
        for(int i=0;i<x-1;i++){
            if(obj.get(i)>=obj.get(i+1)){
                return false;
            }
        }
        return true;
       
    }
    public void fun(TreeNode root){
        if(root==null){
            return ;
        }
        fun(root.left);
        obj.add(root.val);
        fun(root.right);
    }
}
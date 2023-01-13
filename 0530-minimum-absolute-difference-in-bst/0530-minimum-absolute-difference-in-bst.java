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
    ArrayList<Integer>obj = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        
        fun(root);
        Collections.sort(obj);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<obj.size()-1;i++){
                if(diff>(obj.get(i+1)-obj.get(i))){diff=(obj.get(i+1)-obj.get(i));}
        }
        return diff;
    }
    public void fun(TreeNode root){
        if(root==null){
           return; 
        }
        obj.add(root.val);
        fun(root.left);
        fun(root.right);
        
    }
}
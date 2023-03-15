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
    ArrayList<TreeNode> obj = new ArrayList<>();
    public boolean isCompleteTree(TreeNode root) {
        obj.clear();
        obj.add(root);
        fun(root);
        int x = obj.size();
        int i=1;
        int count=Integer.MAX_VALUE;
        while(i<x){
            if(obj.get(i)==null){count=i;}
            else{if(count<i){return false;}}
            i++;
        }
        return true;
    }
    public void fun(TreeNode root){
        if(root==null){return;}
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            obj.add(t);
            if(t!=null){
                q.add(t.left);
                q.add(t.right);
            }
            
        }
    }
}
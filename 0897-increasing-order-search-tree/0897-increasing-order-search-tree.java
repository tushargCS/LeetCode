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
    TreeNode r=null;
    public TreeNode increasingBST(TreeNode root) {
        fun(root);
        Collections.sort(obj);
        int x = obj.size();
        System.out.println(obj);
        for(int i=0;i<x;i++){
            TreeNode o = new TreeNode(obj.get(i));
            if(r==null){
                r=o;
            }
            else{
                TreeNode t = r;
                while(t.right!=null){
                    t=t.right;
                }
                t.right = o;
            }
        }
        
        return r;
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
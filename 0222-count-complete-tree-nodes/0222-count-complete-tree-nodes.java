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
    public int countNodes(TreeNode root) {
        check(root);
        return obj.size();
    }
    
    public void check(TreeNode root){
        if(root==null){
            return;
        }
        obj.add(root.val);
        check(root.left);
        check(root.right);
    }
}
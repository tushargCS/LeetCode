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
    public int minDiffInBST(TreeNode root) {
        bst(root);
        System.out.println(obj);
        Collections.sort(obj);
        
        int s = obj.size();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s-1;i++){
            if(min>(obj.get(i+1)-obj.get(i))){
                min = (obj.get(i+1)-obj.get(i));
            }
        }
        return min;
    }
    
    public void bst(TreeNode root){
        if(root==null){return;}
        obj.add(root.val);
        bst(root.left);
        bst(root.right);
    }
}
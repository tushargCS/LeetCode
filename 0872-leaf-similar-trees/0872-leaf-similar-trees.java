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
      ArrayList<Integer>obj1 = new ArrayList<>();
      ArrayList<Integer>obj2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        trav1(root1);
        trav2(root2);
        
        if(obj1.size()!=obj2.size()){
            return false;
        }        
        else{
            int i=0;
            while(i<obj1.size()){
                if(obj1.get(i)!=obj2.get(i)){
                    return false;
                }
                i++;
            }
            
        }
        return true;
    }
    public void trav1(TreeNode root){
        if(root==null){return;}
        if(root.left==null && root.right==null){obj1.add(root.val);}
        trav1(root.left);
        trav1(root.right);
    }
     public void trav2(TreeNode root){
        if(root==null){return;}
        if(root.left==null && root.right==null){obj2.add(root.val);}
        trav2(root.left);
        trav2(root.right);
    }
}
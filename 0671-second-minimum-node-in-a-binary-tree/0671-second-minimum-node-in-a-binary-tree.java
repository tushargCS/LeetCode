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
    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        int min1 = Integer.MAX_VALUE;
        for(int i=0;i<obj.size();i++){
            if(min1>=obj.get(i)){min1=obj.get(i);}
        }
        int c=0;
        int min2 = Integer.MAX_VALUE;
         for(int i=0;i<obj.size();i++){
            if(min2>=obj.get(i) && obj.get(i)!=min1){c=1;min2=obj.get(i);}
        }
        
        if(c==1){return min2;}
        return -1;
        
    }
    public void helper(TreeNode root){
        if(root==null){return;}
        obj.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
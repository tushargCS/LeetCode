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
    
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int min = Integer.MIN_VALUE;
        int min_ind = 1;
        int x=0;
        while(q.size()!=0){
            int sum=0;
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode c = q.poll();
                sum+=c.val;
                if(c.left!=null){
                    q.add(c.left);
                }
                if(c.right!=null){
                    q.add(c.right);
                }
            }
            x++;
            if(sum>min){
                min = sum;
                min_ind = x;
            }
        }
        
        return min_ind;
    }
    
}
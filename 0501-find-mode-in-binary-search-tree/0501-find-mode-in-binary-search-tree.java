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
       int count=1;
        int max=0;
    Integer prev = null;
    public int[] findMode(TreeNode root) {
        
        List<Integer>modes =  new ArrayList<>();
        
        fun(root,modes);
        
        int arr[]= new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            arr[i]=modes.get(i);
        }
        return arr;
    }
    
    public void fun(TreeNode root,List<Integer>modes){
        if(root==null){return;}
        
        fun(root.left,modes);
        
        if(prev!=null){
            if(prev==root.val){
                count++;
                
            }
            else{
                count=1;
            }
        }
        if(count>max){
            max=count;
            modes.clear();
            modes.add(root.val);
        }else if(count==max){
            modes.add(root.val);
        }
        
        prev = root.val;
        
        
        fun(root.right,modes);
    }
    
}
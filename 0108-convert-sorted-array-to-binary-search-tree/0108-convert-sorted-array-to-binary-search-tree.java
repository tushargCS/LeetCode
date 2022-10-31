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
    public TreeNode sortedArrayToBST(int[] n) {
        TreeNode head = helper(n,0,n.length-1);
        return head;
    }
    
    public TreeNode helper(int n[], int low , int high ){
        if(low>high){return null;}
        int mid = (low+high) /  2;
        TreeNode node = new TreeNode(n[mid]);
        node.left = helper(n,low,mid-1);
        node.right = helper(n,mid+1,high);
        return node;
    }
}
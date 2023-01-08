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
    HashMap<Integer,Integer>map= new HashMap<>();
    public int[] findMode(TreeNode root) {
        fun(root);
        int max=0;
        int r = 0;
        Iterator<Integer> I =map.keySet().iterator();
        Iterator<Integer> I1 =map.keySet().iterator();
        ArrayList<Integer>obj1 = new ArrayList<>();
       
        while(I.hasNext()){
           Integer key =I.next();
            if(map.get(key)>max){max = map.get(key); r =key;}
        }
        
        
        while(I1.hasNext()){
           Integer key =I1.next();
            if(map.get(key)==max){obj1.add(key);}
        }
        int arr[]= new int[obj1.size()];
        for(int i=0;i<obj1.size();i++){
            arr[i]=obj1.get(i);
        }
        
        return arr;
    }
    public void fun(TreeNode root){
        if(root==null){return;}
        if(map.containsKey(root.val)){
            int t  = map.get(root.val);t++;map.put(root.val,t);
        }
        else{map.put(root.val,1);}
        fun(root.left);
        fun(root.right);
        return;
    }
}
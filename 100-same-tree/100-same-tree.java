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
    boolean ans=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null) && (q==null)){
            return true;
        }
        if (q == null || p == null) return false;
        if(p.val!=q.val){
            ans=false;
            return ans;
        }
       return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
       
    }
}
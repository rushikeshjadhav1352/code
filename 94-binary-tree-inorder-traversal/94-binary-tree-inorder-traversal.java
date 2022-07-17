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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
       return inorderTraversalUtil(root);
        
    }
   List<Integer> inorderTraversalUtil(TreeNode root){
        if(root==null){
            List<Integer> ans=new ArrayList<>();
            return ans;
        }
       List<Integer> ans=new ArrayList<>();
       ans.addAll(inorderTraversalUtil(root.left));
       ans.add(root.val);
       ans.addAll(inorderTraversalUtil(root.right));
       return ans;
    }
}
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
    static int max(TreeNode root , int count){
        if(root == null)
            return 0;
        return 1 + Math.max(max(root.left , count) , max(root.right , count));
    }
    public int maxDepth(TreeNode root) {
        
        return max(root , 0);
    }
}
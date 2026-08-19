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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        max(root);
        return maxsum;
    }

    private int max(TreeNode root){

        if(root == null)
            return 0;
        
        int leftsum = Math.max(0 , max(root.left));
        int rightsum = Math.max(0 , max(root.right));

        int current = root.val + leftsum + rightsum;
    
        maxsum = Math.max(maxsum , current);
    
        return root.val + Math.max(leftsum , rightsum);

    }
}
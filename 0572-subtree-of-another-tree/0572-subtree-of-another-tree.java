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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        
        if(root == null)
            return false;
        
        if(equal(root , subroot))
            return true;

        return isSubtree(root.left , subroot) || isSubtree(root.right , subroot);

    }

    private boolean equal(TreeNode root , TreeNode subroot){

        if(root == null && subroot == null)
            return true;
        
        if(root == null || subroot == null)
            return false;
        
        return (root.val == subroot.val) &&
            equal(root.left, subroot.left) &&
            equal(root.right, subroot.right);            
        
    }
}
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

    static int bfs(TreeNode root , int low , int high){
        
        int sum =0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();

            if(cur.val >= low && cur.val <= high)
                sum += cur.val;
                
            if(cur.left != null)
                queue.offer(cur.left);
            
            if(cur.right != null)   
                queue.offer(cur.right);
        }

        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {

        int res = bfs(root , low , high);
        return res;
    }
}
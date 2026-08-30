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
        
        if(root == null)
            return -1;
        
        int maxsum = Integer.MIN_VALUE;
        int maxlevel = 1;
        int curlevel = 1;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while(!queue.isEmpty()){

            int sum = 0;
            int n = queue.size();

            for(int  i =0 ; i< n ; i++){

                TreeNode cur = queue.poll();

                sum += cur.val;

                if(cur.left != null)
                    queue.offer(cur.left);
                
                if(cur.right != null)
                    queue.offer(cur.right);
                
            }

            if(sum > maxsum){
                maxsum = sum;
                maxlevel = curlevel;
            }
                curlevel++;
        }
        return maxlevel;
    }
}
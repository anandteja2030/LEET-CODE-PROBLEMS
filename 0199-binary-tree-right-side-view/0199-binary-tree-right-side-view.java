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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();

        if(root == null) 
            return list;
        
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){

            int n = queue.size();

            for(int i =0 ; i< n ; i++){

                TreeNode cur = queue.poll();
                if(i == n - 1)
                    list.add(cur.val);

                if(cur.left != null)
                    queue.offer(cur.left);
                
                if(cur.right != null)
                    queue.offer(cur.right);
            }
           

        }
        return list;
    }
}
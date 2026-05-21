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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean k = false;
        while(q.size()>0){
            TreeNode front = q.remove();
            if(front == null) k= true;
            else{
            q.add(front.left);
            q.add(front.right);
            if(front != null && k == true){
             return false;
              }
            }
            
        }
        return true;
    }
}
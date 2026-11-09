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
    List<Integer> l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        dfs(root);
        return l;
    }

    public void dfs(TreeNode node){
        if(node==null)
            return;

        dfs(node.left);
        l.add(node.val);
        dfs(node.right);
    }
}
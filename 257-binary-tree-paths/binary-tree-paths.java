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
    List<String> l=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return l;
        
        traverse(root, "");
        return l;
        


    }

    public void traverse(TreeNode root, String path){
        if(root==null)
            return;

        if (root == null) {
            return;
        }

        if (path.equals("")) {
            path += root.val;
        } else {
            path += "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            l.add(path);
            return;
        }

        traverse(root.left, path);
        traverse(root.right, path);
    
        
    }
}
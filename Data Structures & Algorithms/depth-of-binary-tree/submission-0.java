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
    public int h(TreeNode root){
        if(root==null) return 0;
        int l=h(root.left);
        int r=h(root.right);
        return Math.max(l,r)+1;
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int a=h(root.left);
        int b=h(root.right);
        return Math.max(a,b)+1;
    }
}

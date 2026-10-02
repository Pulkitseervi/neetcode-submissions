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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();
        int s=q.size();
        for(int i=s;i>0;i--){
            TreeNode  c=q.poll();
         
           if(c!=null){
            l.add(c.val);
            q.add(c.left);
            q.add(c.right);
           }
        }
        if(l.size()>0){
            ans.add(l);
        }
        }
        return ans;
    }
}

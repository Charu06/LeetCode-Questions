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
    public List<Integer> largestValues(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        List<Integer> res=new ArrayList<>();
        res.add(root.val);
        int level=0;
        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                    list.add(node.left.val);
                }
                if(node.right!=null){
                    q.offer(node.right);
                    list.add(node.right.val);
                }
            }
            if(!q.isEmpty()){
                int n=list.size();
                for(int i=0;i<n;i++){
                    if(list.get(i)>max)
                        max=list.get(i);
                }
                res.add(max);
            }
        }
        return res;
    }
}
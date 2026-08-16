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
    ArrayList<ArrayList<String>> ans;
    
    void f(TreeNode node,ArrayList<String> path){
        
        if(node.left==null && node.right==null){
            path.add("" + node.val);
            ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        path.add(node.val + "->");
        if(node.left!=null) f(node.left,path);
        if(node.right!=null) f(node.right,path);
        
        path.remove(path.size()-1);
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        List<String> str = new ArrayList<>();
        if(root==null) return str
        ;
        ArrayList<String> path = new ArrayList<>();
        f(root,path);

        for(int i=0;i<ans.size();i++) str.add(String.join("",ans.get(i)));
        return str; 
    }
}
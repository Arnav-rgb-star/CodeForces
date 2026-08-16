/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    ArrayList<ArrayList<Integer>> ans;
    
    void f(Node node,ArrayList<Integer> path){
        
        if(node.left==null && node.right==null){
            path.add(node.data);
            ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        path.add(node.data);
        if(node.left!=null) f(node.left,path);
        if(node.right!=null) f(node.right,path);
        
        path.remove(path.size()-1);
        return;
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ans = new ArrayList<>();
        
        if(root==null) return ans;
        ArrayList<Integer> path = new ArrayList<>();
        f(root,path);
        return ans;
    }
}
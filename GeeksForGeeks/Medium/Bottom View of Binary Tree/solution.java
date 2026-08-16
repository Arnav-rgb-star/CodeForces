/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        
        Deque<Node> q = new ArrayDeque<>();
        TreeMap<Integer,Integer> m = new TreeMap<>();
        Deque<Integer> col = new ArrayDeque<>();
        
        q.offer(root);
        col.offer(0);
        
        while(!q.isEmpty()){
            int n = q.size();
            
            for(int i=0;i<n;i++){
                Node node= q.pop();
                int c = col.pop();
                
                m.put(c,node.data);
                
                
                if(node.left!=null){
                    q.offer(node.left);
                    col.add(c-1);
                }
                if(node.right!=null){
                    q.offer(node.right);
                    col.add(c+1);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
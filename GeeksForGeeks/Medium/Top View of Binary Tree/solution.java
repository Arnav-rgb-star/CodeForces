/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        
        if(root==null) return ans;
        Deque<Integer> col = new ArrayDeque<>();
        TreeMap<Integer,Integer> m = new TreeMap<>();
        q.offer(root);
        col.offer(0);
        
        while(!q.isEmpty()){
            int n = q.size();
            
                Node node = q.pop();
                int c = col.pop();
                
                if(!m.containsKey(c)){
                    m.put(c,node.data);
                }
                if(node.left!=null){
                    q.offer(node.left);
                    col.offer(c-1);
                }
                if(node.right!=null){
                    q.offer(node.right);
                    col.offer(c+1);
                }
            
        }
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}
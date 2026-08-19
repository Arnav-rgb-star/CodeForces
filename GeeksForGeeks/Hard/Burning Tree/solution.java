/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public int minTime(Node root, int target) {
        
        int time=-1;
        if(root==null) return 0;

        Deque<Node> d = new ArrayDeque<>();
        
        HashMap<Node,Node> parent = new HashMap<>();
        
        Node targetNode=null;

        d.offer(root);

        while(!d.isEmpty()){

            int n = d.size();
            for(int i=0;i<n;i++){
                Node current = d.pop();

                if(current.data== target) targetNode = current;

                if(current.left!=null){
                    parent.put(current.left,current);
                    d.offer(current.left);
                }

                if(current.right!=null){
                    parent.put(current.right,current);
                    d.offer(current.right);
                }
            }
        }

        d.offer(targetNode);
        Set<Node> visited = new HashSet<>();
        visited.add(targetNode);

        while(!d.isEmpty()){

            int n = d.size();
            for(int i=0;i<n;i++){
                Node current = d.pop();

                if(current.left!=null && visited.add(current.left)) d.offer(current.left);

                if(current.right!=null && visited.add(current.right)) d.offer(current.right);

                Node par = parent.get(current);
                if(par!=null && visited.add(par)) d.offer(par);
            }
            ++time;
        }
        return time;
        
    }
}




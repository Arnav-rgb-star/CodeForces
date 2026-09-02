/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    
    Node predecessor(Node root,int key){
        Node ans = null;
        Node temp = root;
        
        while(temp!=null){
            if(temp.data<key){
                ans = temp;
                temp=temp.right;
            }else{
                temp=temp.left;
            }
        }
        
        return ans;
    }
    
    Node successor(Node root,int key){
        Node ans = null;
        Node temp = root;
        
        while(temp!=null){
            if(temp.data<=key){
                temp=temp.right;
            }else{
                ans = temp;
                temp=temp.left;
            }
        }
        
        return ans;
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
      ArrayList<Node> list = new ArrayList<>();
      
      
      list.add(predecessor(root,key));
      list.add(successor(root,key));
      return list;
        
    }
}
public class postorder {
      public static class Node {
        int val; // initial at 0
        Node left; // initially at null 
        Node right; // ''''''

        // also create constructor
        
        public Node(int val){
            this.val = val;
        }

    }

public static void postorder(Node root){
    // inorder is  left root right
    if(root ==  null) return;
     postorder(root.left);
  
     postorder(root.right);
       System.out.println(root.val);
}

    public static void main(String[] args) {
       
    Node root = new Node(1);
       
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
   a.left = c;
   a.right = d;
   Node e = new Node(6);
   Node f = new Node(7);
   b.left = e;
   b.right= f;
   
      postorder(root);
  
    }
}

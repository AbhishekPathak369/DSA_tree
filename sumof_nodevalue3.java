public class sumof_nodevalue3{
    // package trees;
  static int size =0;


    public static class Node {
        int val; // initial at 0
        Node left; // initially at null 
        Node right; // ''''''

        // also create constructor
        
        public Node(int val){
            this.val = val;
        }

    }

    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
       
        // System.out.println(root.val);
        Node a = new Node(2);
        // System.out.println(a.val);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
   a.left = c;
   a.right = d;
   Node e = new Node(6);
   b.right = e;
   



System.out.println(sum(root));
    }


}

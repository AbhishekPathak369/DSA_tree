// package trees;

public class implementation1 {

    public static class Node {
        int val; // initial at 0
        Node left; // initially at null 
        Node right; // ''''''

        // also create constructor
        
        public Node(int val){
            this.val = val;
        }

    }
 public static void display(Node root){
    if(root == null) return;
    System.out.print(root.val + "-> " );
    if(root.left != null) System.out.print(root.left.val + " ");
    if(root.right != null) System.out.print(root.right.val + " ");
    System.out.println();
    display(root.left);
    display(root.right);
 }
    public static void main(String[] args) {
        Node root = new Node(3);
       
        // System.out.println(root.val);
        Node a = new Node(80);
        // System.out.println(a.val);
        Node b = new Node(20);
        root.left = a;
        root.right = b;
                Node c = new Node(10);
        Node d = new Node(35);
   a.left = c;
   a.right = d;
   Node e = new Node(6);
   b.right = e;

display(root);
    }

}
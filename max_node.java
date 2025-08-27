public class  max_node{
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

  public static int max(Node root){
    if(root == null) return 0;
    int a = root.val;
    int b = max(root.left);
    int c = max(root.right);
    return Math.max(a,Math.max(b, c));
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
        Node d = new Node(50);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;

        System.out.println(max(root));
   



       
    }


}

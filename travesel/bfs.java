public class bfs { // also called level order tree
    
// this is recursive approach we have modern approach like using queue

 public static class Node {
        int val; // initial at 0
        Node left; // initially at null 
        Node right; // ''''''

        // also create constructor
        
        public Node(int val){
            this.val = val;
        }}

  public static int height(Node root){   // we first need to find height so that we can do level order traversal
    if(root == null || (root.left == null&& root.right == null)) return 0;
  return 1 + Math.max(height(root.left),height(root.right));
    
  }      
public static void bfs(Node root,int n){  // use recursion for BFS
    if(root == null) return;
    if(n == 1){System.out.print(root.val);
        return; }
    bfs(root.left, n-1);
    bfs(root.right, n-1);
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
   Node l = new Node(9);
   e.left = l;
   int level = height(root);
   level++;
     for(int i =0; i< level; i++){
        bfs(root, i);
        System.out.println();
     }
     
}
}

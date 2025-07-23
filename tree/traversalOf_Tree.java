
class traversalOf_Tree {
   public static class Node {
      int val;
      Node left;
      Node right;

      public Node(int val) {
         this.val = val;
      }
   }

   public static void preorder(Node root) {// root left right
      if (root == null) {
         return;
      }
      System.out.print(root.val + " ");
      preorder(root.left);
      preorder(root.right);
   }

   // inorder left root right
   public static void inorder(Node root) {
      if (root == null) {
         return;
      }
      inorder(root.left);
      System.out.print(root.val + " ");
      inorder(root.right);
   }

   // post order left right root

   public static void postOrder(Node root) {
      if (root == null) {
         return;
      }

      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.val + " ");
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
      postOrder(root);
      System.out.println();
      inorder(root);
      System.out.println();
      postOrder(root);

   }
}

public class printElementOf_Nth_level {

   public static class Node {
      int val;
      Node left;
      Node right;

      public Node(int val) {
         this.val = val;
      }
   }
   public static void nthlevel(Node root, int n) {
      if (root == null) {
         return;
      }
      if (n == 1) {
         System.out.println(root.val + " ");
      }
      nthlevel(root.left, n - 1);
      nthlevel(root.right, n - 1);
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
      nthlevel(root, 4);

   }
}

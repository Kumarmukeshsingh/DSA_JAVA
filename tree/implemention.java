
public class implemention {
   private static class Node {
      int val;
      Node left;
      Node right;

      public Node(int val) {
         this.val = val;
      }
   }
   // size of the binary tree
   public static int size(Node root) {
      if (root == null) {
         return 0;
      }
      return 1 + size(root.left) + size(root.right);
   }

   // sum of the binary tree
   public static int sum(Node root) {
      if (root == null) {
         return 0;
      }
      return root.val + sum(root.left) + sum(root.right);
   }

   // find max value of tree
   public static int maxValue(Node root) {
      if (root == null) {
         return Integer.MIN_VALUE;
      }
      int a = root.val;
      int b = maxValue(root.left);
      int c = maxValue(root.right);
      return Math.max(a, Math.max(b, c));
   }

   // height of the binary tree
   public static int height(Node root) {
      if (root == null) {
         return 0;
      }
      if (root.left == null && root.right == null) {
         return 0;
      }
      return 1 + Math.max(height(root.left), height(root.right));
   }

   public static void display(Node root) {
      if (root == null) {
         return;
      }
      System.out.print(root.val + "-->");

      if (root.left != null) {
         System.out.print(root.left.val + " ");
      }
      if (root.right != null) {
         System.out.print(root.right.val + " ");
      }
      System.out.println();
      display(root.left);
      display(root.right);

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
      display(root);
      System.out.println("size " + size(root));
      System.out.println("sum " + sum(root));
      System.out.println("maxValue " + maxValue(root));
      System.out.println("height " + height(root));

   }
}

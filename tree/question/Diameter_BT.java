
// longest distance of tree and diameter of tree

import org.w3c.dom.Node;

public class Diameter_BT {
   public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      public TreeNode(int val) {
         this.val = val;
      }
   }

   public static int height(TreeNode root) {
      if (root == null || (root.left == null && root.right == null)) {
         return 0;
      }
      return 1 + Math.max(height(root.left), height(root.right));
   }

   public static int diameterOfBT(TreeNode root) {

      if (root == null || (root.left == null && root.right == null)) {
         return 0;
      }
      int leftAns = diameterOfBT(root.left);
      int rightAns = diameterOfBT(root.right);
      int mid = height(root.left) + height(root.right);
      if (root.left != null) {
         mid++;
      }
      if (root.right != null) {
         mid++;
      }
      int max = Math.max(leftAns, Math.max(rightAns, mid));
      // System.out.println(max);
      return max;
   }

   public static void main(String[] args) {
      TreeNode root = new TreeNode(1);
      TreeNode a = new TreeNode(2);
      TreeNode b = new TreeNode(3);
      root.left = a;
      root.right = b;
      TreeNode c = new TreeNode(4);
      TreeNode d = new TreeNode(5);
      a.left = c;
      c.right = d;
      System.out.println(diameterOfBT(root));
   }

}

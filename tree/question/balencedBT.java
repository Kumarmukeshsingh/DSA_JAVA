
public class balencedBT {
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

   public static boolean isBalancedBT(TreeNode root) {
      if (root == null) {
         return true;
      }
      int leftHeight = height(root.left);
      int rightHeight = height(root.right);
      if (root.left != null)
         leftHeight++;
      if (root.right != null)
         rightHeight++;
      int d = leftHeight - rightHeight;
      if (d > 1)
         return false;

      return (isBalancedBT(root.left) && isBalancedBT(root.right));
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
      a.right = d;
      System.out.println(isBalancedBT(root));
   }

}

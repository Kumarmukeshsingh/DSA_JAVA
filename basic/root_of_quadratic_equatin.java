public class root_of_quadratic_equatin {
   public static void main(String[] args) {
      double a = 2, b = 4, c = 2;
      double root1, root2;
      double determinant = b * b - 4 * a * c;

      if (determinant > 0) {
         root1 = (-b + Math.sqrt(determinant)) / (2 * a);
         root2 = (-b - Math.sqrt(determinant)) / (2 * a);
         System.out.format("root1=%.2f and root2=%.2f", root1, root2);
      } else if (determinant == 0) {
         root1 = root2 = -b / (2 * a);
         System.out.format("root1=root2=%.2f", root1);

      } else {
         double real = -b / (2 * a);
         double imagenry = Math.sqrt(-determinant) / (2 * a);
         System.out.format("root1 = %.2f + %2fi", real, imagenry);
         System.out.format("\nroot2 = %.2f - %.2fi", real, imagenry);
         
      }
   }

}

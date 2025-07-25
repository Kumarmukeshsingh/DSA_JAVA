// 2 directional 
public class printPath {
   public static void main(String[] args) {
      int row = 3;
      int cols = 3;
      print(1, 1, row, cols, "");

   }

   private static void print(int sr, int sc, int er, int ec, String s) {
      if (sr > er || sc > ec)
         return;
      if (sr == er && sc == ec) {
         System.out.println(s);
         return;
      }

      // go down
      print(sr + 1, sc, er, ec, s + "D");
      // go right
      print(sr, sc + 1, er, ec, s + "R");
   }

}

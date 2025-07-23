 

public class pathCount {

   public static void main(String[] args) {
      int row = 10;
      int cols = 10;
      int count = maze(1, 1, row, cols);
      System.out.println( "the possible path is : "+count);
   }

   private static int maze(int sr, int sc, int er, int ec) {

      if (sr > er || sc > ec)
         return 0;
      if (sr == er && sc == ec)
         return 1;

      int downways = maze(sr + 1, sc, er, ec);
      int rightways = maze(sr, sc + 1, er, ec);
      int total = downways + rightways;
      return total;
   }
}

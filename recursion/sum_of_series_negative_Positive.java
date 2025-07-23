import java.util.Scanner;

public class sum_of_series_negative_Positive {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("entr the the number of series");
      int n = in.nextInt();
      System.out.println(seriesSum(n));
   }

   static int seriesSum(int n) {
      if (n == 0)
         return 0;
      if (n % 2 == 0) {// even
         return seriesSum(n - 1) - n;

      } else {// odd
         return seriesSum(n - 1) + n;
      }

   }

}

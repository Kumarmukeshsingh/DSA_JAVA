
public class factorial {

   public static int fact(int n) {
      if (n == 0 || n == 1) {
         return n;
      }
      int fact1 = fact(n - 1);
      int fact2 = n * fact1;
      return fact2;
   }
   public static void main(String[] args) {
      int ans = fact(5);
      System.out.println(ans); // 120
   }
}

// fac(5)=
// 5*fac(4) ->5*24=120;
// 4*fac(3) ->4*6= 24;
// 3*fac(2) ->3*2= 6;
// 2*fac(1) ->2*1= 2;
// 1*fac(0) ->1*0= 0;

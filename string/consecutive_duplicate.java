public class consecutive_duplicate {
   // output is : a2b4
   public static void main(String[] args) {
      String str = "aaabbbb";
      String ans = " " + str.charAt(0);// a
      int count = 0;
      int n = str.length();
      // System.out.println(n);
      for (int i = 1; i < n; i++) {
         char curr = str.charAt(i);
         char prev = str.charAt(i - 1);
         if (curr == prev) {
            count++;
         } else {// curr!=prev
            if (count > 1) {// if a1 tiems then not show a1 show a only
               ans += count;
            }
            count = 1;
            ans += curr;
         }
      }
      if (count > 1) {

         ans += count;
      }
      System.out.println(ans);
   }
}

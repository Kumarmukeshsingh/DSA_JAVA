
// abccbaabc?=
public class reverse {

   public static String reverse(String s) {
      String r = "";
      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         System.out.println(ch);
         r = ch + r;
      }
      return r;
   }

   public static void main(String[] args) {
      String s = "Mukesh";
      System.out.println(s + reverse(s) + s);
   }
}
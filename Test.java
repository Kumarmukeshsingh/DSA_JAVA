
public class Test {

   public static void main(String[] args) {
      String str = "krishna     ram";
      String ans = "";
      for (int i = str.length() - 1; i >= 0; i--) {
         char ch = str.charAt(i);
         // System.out.println(ch);
         ans += str.charAt(i);
      }
      System.out.println(ans);
   }
}
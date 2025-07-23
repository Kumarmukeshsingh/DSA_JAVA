import java.util.*;

public class reverseString {
   public static void main(String[] args) {
      String str = " i am a teacher ";
      String ans = "";
      StringBuilder sb = new StringBuilder("");
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);

         if (ch != ' ') {
            // System.out.println(ch);
            sb.append(ch);
         } else { // ch=" "
            // System.out.println(ch);
            sb.reverse();
            ans += sb;
            ans += " ";
            sb = new StringBuilder("");
         }
      }
      sb.reverse();
      ans += sb;
      System.out.println(ans);

   }

   // public static String reverseWord(String str) {
   // String[] words = str.split("");
   // StringBuilder result = new StringBuilder("");
   // for (String word : words) {
   // StringBuilder sb = new StringBuilder(word);
   // result.append(sb.reverse().toString()).append("");
   // }
   // return result.toString();
   // }

}

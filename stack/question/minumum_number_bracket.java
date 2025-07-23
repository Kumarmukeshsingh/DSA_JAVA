
import java.util.Scanner;
import java.util.Stack;

public class minumum_number_bracket {
   public static void main(String[] args) {

      // Scanner se = new Scanner(System.in);
      // String str = se.nextLine();
      // System.out.println(minmumBracket(str));
      String str = "(())";
      minmumBracket(str);

   }

   public static void minmumBracket(String str) {
      Stack<Character> st = new Stack<>();
      Stack<Character> gt = new Stack<>();
      int n = str.length();
      System.out.println(n);
      String se = "";

      for (int i = 0; i < n; i++) {
         char ch = str.charAt(i);// ()(()
         if (ch == '(') {

            st.push(ch);
            gt.push(ch);
            se += ch;

         } else {
            if (st.size() == 0)
               return;

            if (st.peek() == '(') {
               gt.push(st.pop());
               se += st.peek();

            }
         }

      }
      System.out.println(se);
      System.out.println(gt);
   }

}

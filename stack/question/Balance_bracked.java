import java.util.Scanner;
import java.util.Stack;

class Balance_bracked {

   public static boolean isbalanced(String str) {

      Stack<Character> st = new Stack<>();
      int n = str.length();

      for (int i = 0; i < n; i++) {
         char ch = str.charAt(i);
         if (ch == '(') {
            st.push(ch);
         } else {
            if (st.size() == 0) {
               return false;
            }

            if (st.peek() == '(') {
               st.pop();
            }
         }
         System.out.println(st);

      }

      if (st.size() > 0) {
         return false;
      } else {
         return true;
      }

   }

   public static void main(String[] args) {
      // Scanner se = new Scanner(System.in);
      // String str = se.nextLine();
      // System.out.println(str);
      String str = "()()";
      System.out.println(isbalanced(str));

   }
}

import java.util.Scanner;

// remove all the occurence of "a" from the string
public class remove_all_occurence {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println(removea(s, 0));

   }

   static String removea(String s, int idx) {
      // base case
      if (idx == s.length()) {
         return "";
      }
      // recursive work
      String smallans = removea(s, idx + 1);
      char currchar = s.charAt(idx);
      System.out.println(currchar);
      // self work
      if (currchar != 'a') {
         return currchar + smallans;
      } else {
         return smallans;
      }
   }

}

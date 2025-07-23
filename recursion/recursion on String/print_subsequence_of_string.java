import java.util.ArrayList;

public class print_subsequence_of_string {

   static ArrayList<String> getssq(String s) {
      ArrayList<String> ans = new ArrayList<>();
      // base case
      if (s.length() == 0) {
         ans.add(" ");
         return ans;
      }
      char curr = s.charAt(0);// a
      System.out.println("curr: " + curr);
      ArrayList<String> smallans = getssq(s.substring(1));
      System.out.println("sm " + smallans);

      for (String ss : smallans) {
         ans.add(ss);
          ans.add(curr + ss);
      }

      return ans;
   }

   public static void main(String[] args) {
      ArrayList<String> result = getssq("abc");
      for (String s : result) {
         System.out.println(" subsequence of string : " + s);
      }
   }
}

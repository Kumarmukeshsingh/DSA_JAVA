 

import java.util.HashMap;
import java.util.HashSet;

public class isomorphic_string {
   public static void main(String[] args) {
      String s = "egg";
      String t = "add";
      isIsomorphic(s, t);
   }

   public static boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> mp = new HashMap<>();
      HashSet<Character> st = new HashSet<>();
      for (int i = 0; i < s.length(); i++) {
         Character sch = s.charAt(i);
         
         Character tch = t.charAt(i);
         
         if (mp.containsKey(sch)) {
            if (mp.get(sch) != tch)
               return false;

         } else if (st.add(tch)) {
            return false;
         } else {
            mp.put(sch, tch);
            st.add(tch);
         }
      }
      return true;
   }

}

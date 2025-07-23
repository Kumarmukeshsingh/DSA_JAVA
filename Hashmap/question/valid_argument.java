package question;

import java.util.HashMap;

public class valid_argument {

   // public boolean isAnagram(String s, String t) {
   // if(s.length()!=t.length()) return false;

   // HashMap<Character, Integer> mp1 = makeFrequenceMap(s);
   // HashMap<Character,Integer> mp2 = makeFrequenceMap(t);
   // return mp1.equals(mp2);
   // }

   public boolean isAnagram(String s, String t) {
      if (s.length() != t.length())
         return false;

      HashMap<Character, Integer> mp = makeFrequenceMap(s);
      for (int i = 0; i < t.length(); i++) {
         Character ch = t.charAt(i);
         if (!mp.containskey(ch))
            return false;
         int currfreq = mp.get(ch);
         mp.put(ch, currfreq - 1);
      }
      for (Integer i : mp.values(i)) {
         if (i != 0)
            return false;
      }
      return true;
   }

   HashMap<Character, Integer> makeFrequenceMap(String str) {
      HashMap<Character, Integer> mp = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
         Character ch = str.charAt(i);
         if (!mp.containsKey(ch)) {
            mp.put(ch, 1);
         } else {
            int currfreq = mp.get(ch);
            mp.put(ch, currfreq + 1);
         }
      }
      return mp;
   }

}

public class palindramic {

   public static void main(String[] args) {
      String str = "aba";
      int i = 0;
      int j = str.length() - 1;

      boolean flag = true; /// ture = palindrom
      while (i < j) {
         // System.out.println(str.charAt(i));
         // System.out.println(str.charAt(j));
         if (str.charAt(i) != str.charAt(j)) {
            flag = false;
            break;
         }
         i++;
         j--;
      }
      if (flag == true) {
         System.out.println("palindrom");
      } else {
         System.out.println("not palindrom");
      }

   }

}

public class leap_year {

   public static void main(String[] args) {
      int year = 1904;
      boolean leap = false;
      if (year % 4 == 0) {
         if (year % 100 == 0) {
            if (year % 400 == 0)
               leap = true;
            else
               leap = false;
         } else
            leap = true;
      } else
         leap = false;
      if (leap)
         System.out.println(year + " is a leap years");
      else
         System.out.println(year + " is not a leap years");
   }
}
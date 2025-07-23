
public class sortFruits {
   public static void main(String[] args) {
      String[] fruits = { "apple", "papaya", "banana" };
      sortf(fruits);
      for (String val : fruits) {
         System.out.print(val + "   ");
      }
   }

   static void sortf(String[] fruits) {
      int n = fruits.length;
      for (int i = 0; i < n - 1; i++) {
         int min_Index = i;
         // System.out.println(fruits[i]);
         for (int j = i + 1; j < n; j++) {
            //  System.out.print(fruits[j] + " ");

            if (fruits[j].compareTo(fruits[min_Index]) < 0) {
               min_Index = j;
            }
         }

         String temp = fruits[i];
         fruits[i] = fruits[min_Index];
         fruits[min_Index] = temp;
      }
   }

}

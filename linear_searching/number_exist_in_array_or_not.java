
public class number_exist_in_array_or_not {
   public static void main(String[] args) {
      int arr[] = { 22, 45, 1, 2, 8, 19, -3, -11, 23 };
      int target = 1;
      int ans = linearSearch(arr, target);
      System.out.println(target + " present in index no : " + ans);

   }

   static int linearSearch(int arr[], int target) {
      if (arr.length == 0) {
         return -1;
      }
      for (int i = 0; i < arr.length; i++) {
         int element = arr[i];
         if (element == target) {
            return i;
         }
      }
      return -1;
   }

}

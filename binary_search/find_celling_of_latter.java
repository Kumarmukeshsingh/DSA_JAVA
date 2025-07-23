
/**
 * find_celling_of_latter
 */
public class find_celling_of_latter {

   public static void main(String[] args) {
      char arr[] = { 'a', 'r', 'z' };
      char target = 'm';
      char result = celling(arr, target);
      System.out.println(result);
   }

   static char celling(char[] arr, char target) {
      int n = arr.length;
      if (target >= arr[n - 1])
         return arr[0];

      int start = 0;
      int end = arr.length - 1;
      int ans = -1;
      while (start <= end) {
         int mid = (end + start) / 2;
         if (arr[mid] >= target) {
            end = mid - 1;
            ans = mid;
         } else {
            start = mid + 1;
         }

      }
      return arr[ans];
   }
}

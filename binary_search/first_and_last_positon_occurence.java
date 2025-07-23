import java.util.Arrays;

public class first_and_last_positon_occurence {

   public static int bs(int[] nums, int target, boolean findfastindex) {
      int ans = -1;
      int start = 0;
      int end = nums.length - 1;

      while (start <= end) {
         int mid = start + (end - start) / 2;
         if (target < nums[mid]) {
            end = mid - 1;
         } else if (target > nums[mid]) {
            start = mid + 1;
         } else {
            ans = mid;
            if (findfastindex) {
               end = mid - 1;

            } else {
               start = mid + 1;
            }
         }

      }
      return ans;
   }

   public static int[] searchRange(int[] nums, int target) {
      int[] ans = { -1, -1 };
      int start = bs(nums, target, true);
      int end = bs(nums, target, false);
      ans[0] = start;
      ans[1] = end;
      return ans;
   }

   public static void main(String[] args) {
      int[] nums = { 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 7 };
      int target = 7;
      
      System.out.println(Arrays.toString(searchRange(nums, target)));
   }
}

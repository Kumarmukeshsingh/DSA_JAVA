package question;

import java.util.HashMap;

public class two_sum {
   public static void main(String[] args) {
      int arr[] = { 1, 5, 7, -1 };
      int target = 6;
      twosum(arr, target);
   }

   public static int[] twosum(int[] nums, int target) {
      int n = nums.length;
      int[] ans = -1;
      // value and index
      HashMap<Integer, Integer> mp = new HashMap<>();
      for (int i = 0; i < n; i++) {
         int partner = target - nums[i];
         if (mp.containsKey(partner)) {
          ans=new int[]{i,mp.get(partner)}
         }

         mp.put(nums[i],i);
      }
      return ans;
   }

}

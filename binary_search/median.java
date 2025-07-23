public class median {

   public static double medianOfArray(int[] nums1, int[] nums2) {
      // if nums1 was greater and nums2 was smaller
      if (nums1.length > nums2.length) {
         return medianOfArray(nums1, nums2);
      }
      // if nums1 is smaller and nums2 is grater
      int n1 = nums1.length;
      int n2 = nums2.length;
      int N = n1 + n2;
      int start = 0;
      int end = n1;

      while (start <= end) {
         // mid cut
         int cut1 = start + (end - start) / 2;
         // (n1+n2)/2
         int cut2 = N / 2 - cut1;
         // l1,l2, r1 ,r2
         int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
         int l2 = (cut2 == n1) ? Integer.MIN_VALUE : nums2[cut2 - 1];

         int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
         int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

         // check if cut is valid
         if (l1 <= r2 && l2 <= r1) {
            // if N is odd ,only one median
            if (N % 2 != 0) {
               return (double) Math.min(r1, r2);
            } else {
               // else if N is even ,two median so take average
               return (double) ((Math.max(l1, r2) + Math.min(r1, r2)) / 2.0);
            }
         } else if (l1 > r2) {
            end = cut1 - 1;
         } else {
            start = cut1 + 1;
         }
      }
      return 0.0;// to avoid the error

   }

   public static void main(String[] args) {
      int[] A = { 1, 2, 3, 4, 5 };
      int[] B = { 6, 8, 9, 7 };
      medianOfArray(A, B);

   }
}

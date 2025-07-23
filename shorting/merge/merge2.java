import java.util.Arrays;
public class merge2 {
   public static void merg1(int arr[], int p, int q, int r) {
      int n1 = q - p + 1;
      int n2 = r - q;
      int L[] = new int[n1];
      int M[] = new int[n2];
      // fill the left and right array
      for (int i = 0; i < n1; i++)
         L[i] = arr[p + i];
      for (int j = 0; j < n2; j++)
         M[j] = arr[q + 1 + j];
      // maintain current indexof sub arrays and main array
      int i, j, k;
      i = 0;
      j = 0;
      k = p;
      // element L and M place them in the currect position at A[p..r] for storing in
      // descring use if(L[i]>=[j])
      while (i < n1 && j < n2) {
         if (L[i] <= M[j]) {
            arr[k] = L[i];
            i++;
         } else {
            arr[k] = M[j];
            j++;
         }
         k++;
      }
      // pick up the remining element and put in A[p..r];
      while (i < n1) {
         arr[k] = L[i];
         i++;
         k++;

      }
      while (j < n2) {
         arr[k] = M[j];
         j++;
         k++;

      }

   }

   // divide the array into two sub array , sort them and merge them;
   static void mergesort(int arr[], int left, int right) {
      if (left < right) {
         // m is the point where the array is divided into two sub aarys
         int mid = (left + right) / 2;
         // call recursively to each sub array
         mergesort(arr, left, mid);
         mergesort(arr, mid + 1, right);
         // merge the surted sub arary s
         merg1(arr, left, mid, right);
      }
   }

   public static void main(String[] args) {
      int[] arr = { 6, 5, 12, 10, 9, 1 };
      int n = arr.length;
      mergesort(arr, 0, n - 1);
      System.out.println(Arrays.toString(arr));
   }
}
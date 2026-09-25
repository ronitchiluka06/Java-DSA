// Find the inversions in array and return its count - Optimal sol
import java.util.*;
public class Arrays52 {
    static long count =0;
    public static void  merge(int arr[], int low, int mid, int high){
            int left = low;
            int right = mid+1;
            int temp[] = new int [(high -low) +1 ];
            int index = 0;

            while(left <= mid && right <= high){
                if(arr[left] <= arr[right]){
                    temp[index] = arr[left];
                    left++;
                }
                else{
                    temp[index]= arr[right];
                    count += (mid -left + 1);
                    right++;
                    
                }
                index++;
            }

            while(left<=mid){
                temp[index] = arr[left];
                left++;
                index++;
            }

            while(right<=high){
                temp[index] = arr[right];
                right++;
                index++;
            }


            for(int i= low ; i<=high ;i++){
                arr[i]= temp[i-low];
            }
        }
        public static void mergeSort(int arr[], int low, int high){
            if(low == high){
                return;
            }
            int mid = (low + high)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr , low , mid, high);
        }
    public static long numberOfInversions(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0, n -1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nums[] = new int [n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();

        }

        System.out.println(numberOfInversions(nums));

    }
}

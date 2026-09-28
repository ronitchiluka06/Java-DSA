// Search insert position in array , this is similar to lower bound

import java.util.Scanner;

public class BinarySearch4 {
    public static int lowerBound(int[] nums, int x) {
       int low = 0;
       int high = nums.length -1;
       int ans = nums.length;

       while(low <= high){
        int mid = (low + high)/2;

            if( nums[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;   
            }
       }

       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        
        int nums[] = new int[n];
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(lowerBound(nums,target));
    }
}

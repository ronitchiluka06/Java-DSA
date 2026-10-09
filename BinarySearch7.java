// Search in rotated sorted array-I
import java.util.*;

public class BinarySearch7 {
    public static int search(int[] nums, int k) {
       int left =0;
       int right =nums.length -1;

       int ans = -1;

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid]==k){
                ans= mid;
                return ans;
            }

            if(nums[left]<= nums[mid]){
                if(nums[left]<=k && k<=nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<=k && k<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        
        int nums[] = new int[n];
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(search(nums,target));
        
    }
}

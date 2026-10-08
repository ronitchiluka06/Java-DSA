// Find the first and the last occurence in an array
import java.util.*;

public class BinarySearch6 {
    public static int[] searchRange(int[] nums, int target) {
        int low = 0;
       int high = nums.length -1;
       int first = -1;
       int last = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(target == nums[mid] ){
                last = mid;
                low =mid+1;
            }
            

            else if( nums[mid] > target){
                high = mid-1;
            }
            
            else{
                low = mid+1;   
            }
        }
        low =0;
        high =nums.length -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(target == nums[mid] ){
                first = mid ;
                high =mid-1;
            }
            

            else if( nums[mid] > target){
                high = mid-1;
            }
            
            else{
                low = mid+1;   
            }
        }

       return new int[]{first , last};
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        
        int nums[] = new int[n];
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int ans[] =  (searchRange(nums,target));
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}

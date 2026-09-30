// Find the floor and ceil in an array

import java.util.Scanner;

public class BinarySearch5 {
    public static int[] getFloorAndCeil(int[] nums, int x) {
       int low = 0;
       int high = nums.length -1;
       int floor =-1;
       int ceil = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(x == nums[mid]){
                floor = nums[mid];
                ceil = nums[mid];
                return new int [] {floor, ceil};
            }

            else if( x > nums[mid]){
                floor = nums[mid];
                low = mid+1;
            }
            
            else{
                ceil = nums[mid];
                high = mid-1;   
            }
        }

       return new int[]{floor, ceil};
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        
        int nums[] = new int[n];
        int x = sc.nextInt();

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int ans[] =  (getFloorAndCeil(nums,x));
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}

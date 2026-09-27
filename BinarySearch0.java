// Find x in an array using Binary Search  TC - O(log2 n)

import java.util.*;
public class BinarySearch0 {
    public static int search(int[] nums, int target) {
       int low =0;
       int high = nums.length -1;
       
       while(low <= high){
        int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if( target > nums[mid]){
                low =mid+1;
            }
            else{
                high =mid-1;
            }
       }
       return -1;
    }
    public static void main(String[] args) {
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

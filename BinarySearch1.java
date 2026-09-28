// Find x in array using BS but with recusion. 

import java.util.Scanner;

public class BinarySearch1 {
    public static int binarySearch(int nums[], int low, int high, int target){
        
        if(low > high){
            return -1;
        } 
        int mid = (low + high)/2;
        if(target == nums[mid]){
            return mid;
        }
        else if(target > nums[mid]){
            return binarySearch(nums, mid+1, high, target);
        }
        
        return binarySearch(nums, low ,mid-1, target);
        

    }

    public static int search(int[] nums, int target) {
       return binarySearch(nums, 0, nums.length -1, target);
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

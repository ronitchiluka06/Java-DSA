//Sort an array of 0's 1's and 2's

import java.util.*;

public class Arrays20{
    public static void sortZeroOneTwo(int[] nums) {
        int left = 0 ;
        int mid =0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left]= temp;
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid]= nums[high];
                nums[high]= temp;
                high--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("out");
        sortZeroOneTwo(nums);
        
    }
}

// Move Zeroes to the end of the array 

import java.util.*;

public class Arrays7 {
    public static void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        for(int i= j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
                j++;
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

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        moveZeroes(nums);
    }
}

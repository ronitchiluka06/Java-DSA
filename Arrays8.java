// Linear Search in array

import java.util.*;

public class Arrays8 {
    public static int linearSearch(int nums[], int target) {
		for(int i=0; i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println("Ans"+linearSearch(nums, target));
    }
}

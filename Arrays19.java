// two sum -> optimal for case 1

import java.util.Arrays;
import java.util.Scanner;

public class Arrays19 {
    public static String twoSum(int nums[], int target){
        Arrays.sort(nums);
        int left =0;
        int right = nums.length -1;

        while(left<right){
            int sum = nums[right]+ nums[left];
            if(sum==target){
                return "yes";
            }
            else if( sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return "No";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(twoSum(nums, k));
    }
}

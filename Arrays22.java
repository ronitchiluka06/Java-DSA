// Find the majority element in array which has appeared more than n/2 - Optimal

import java.util.Scanner;

public class Arrays22 {
    public static int  majorityElement(int nums[]){
        int elem = nums[0];
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count == 0){
                elem = nums[i];
            }

            if(nums[i]==elem){
                count++;
            }
            else{
                count--;
            }
        }
        return elem;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(".()"+majorityElement(nums));
    }
}

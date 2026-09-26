// Find the reverse pairs in array and return its count - brute force

import java.util.*;
public class Arrays53 {
    public static int reversePairs(int nums[]){
        int n= nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]> 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(reversePairs(nums));
    }
}

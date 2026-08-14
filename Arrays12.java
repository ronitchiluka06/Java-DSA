/*
    Find the missing element from array (XOR- ^) - Optimal

    first XOR of each elements in array for eg - XOR ^ a[i] 
    , then XOR of each numbers from 0 to n
    , and finally XOR both of them
    
*/

import java.util.Scanner;

public class Arrays12 {
    public static int findMissing(int nums[]){
        int xor1=0;
        int xor2 =0;
        for(int i=0;i<nums.length;i++){
            xor1= xor1^nums[i];
            xor2= xor2 ^ (i+1);
        }
        return xor1 ^ xor2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(findMissing(nums));
    }
}

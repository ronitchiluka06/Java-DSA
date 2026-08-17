// Find a number which appeared only once in an array , where other number appear's twice.

import java.util.*;

public class Arrays14 {
    public static int appearedOnce(int nums[]){
        int xor1 =0;
        for(int i=0;i<nums.length;i++){
            xor1= nums[i] ^ xor1;
        }
        return xor1;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(appearedOnce(nums));
    }
}

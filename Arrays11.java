// Find the missing element from the Array(Hashing) -- Not the optimal one

import java.util.*;

public class Arrays11 {
    public static int missingNumber(int[] nums) {
        int n = nums.length ;
        int hash[] = new int[n+1];

        for(int i=0;i<n;i++){
            hash[nums[i]] +=1;
        }

        for(int i=0;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n-1;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(missingNumber(nums));
    }
}

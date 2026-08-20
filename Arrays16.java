// Longest subarray with given sum K(positives) + (negative) - Optimal only for array that has both +ve and -ve numbers

import java.util.*;

public class Arrays16 {
    public static long longestSubarray(int nums[], int k){
        HashMap<Long,Integer> mpp = new HashMap<>();
        long sum =0;
        int maxlen =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum == k){
                maxlen = i+1;
            }

            if(mpp.containsKey(sum -k)){
                int len = i - mpp.get(sum-k);
                maxlen = Math.max(maxlen, len);
            }

            if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(".()"+longestSubarray(nums, k));
    }
}

// Find Sub-Array with XOR K - Optimal Solution

import java.util.*;

public class Arrays45 {
    public static int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int previousXor =0;
        int count =0;
        mpp.put(0,1);
        for(int i=0;i<nums.length;i++){
            previousXor = previousXor ^ nums[i];
            int ans = k ^ previousXor ;
            if(mpp.containsKey(ans) && mpp.get(ans) >0){
                count = count + mpp.get(ans);
            }
            
            mpp.put(previousXor, mpp.getOrDefault(previousXor, 0)+1);
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int [n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(subarraysWithXorK(nums, k));
    }
}

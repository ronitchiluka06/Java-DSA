//Longest subarray with given sum K(positives) - brute force
import java.util.*;

public class Arrays15 {

    public static int longestSubarray(int nums[], int k){
        int maxlen =0;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                
                
                if(sum == k){
                    int len = j-i+1;
                    maxlen = Math.max(maxlen, len);
                }
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

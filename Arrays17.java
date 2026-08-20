// Longest subarray with given sum K(positives) - Optimal
import java.util.*;

public class Arrays17 {
    public static int longestSubarray(int nums[], int k){
        int left =0;
        int right=0;
        int sum = nums[0];
        int n= nums.length;
        int maxlen =0;

        while(right<n){

            while(left <= right && sum> k){
                sum -= nums[left];
                left++;
            }

            if(sum == k){
                maxlen = Math.max(maxlen, right-left +1 );
            }

            right++;
            if(right<n){
                sum+= nums[right];
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

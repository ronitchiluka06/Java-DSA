// Find the missing and repeating elem in an Array - Better approach , TC - O(2n) , SC - O(n)

import java.util.Arrays;
import java.util.Scanner;

public class Arrays50 {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length ;
        int hash[] = new int[n+1];
        int repeating = -1;
        int missing = -1;
        int ans [] = new int [2];

        for(int i=0;i<n;i++){
            hash[nums[i]]+= 1;
        }

        for(int i=1;i<=n;i++){
            if(hash[i]>1){
                repeating = i;
                ans[0] = repeating;
            }
            else if(hash[i] == 0){
                missing = i;
                ans[1]= missing;
            }

            else if(repeating != -1 && missing != -1){
                return ans; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        int ans[] = findMissingRepeatingNumbers(nums);
        System.out.println(Arrays.toString(ans));
    }
}

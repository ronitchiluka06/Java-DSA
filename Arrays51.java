// Find the missing and repeating elem in an Array - Optimal Solution 

import java.util.Arrays;
import java.util.Scanner;

public class Arrays51 {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length ;
        int ans [] = new int [2];
        int s = 0;
        int sN = (n*(n+1))/2;
        int s2 = 0;
        int sN2 = (n *(n+1)*(2 *n+1))/6;

        for(int i=0;i<n;i++){
            s+= nums[i];
            s2 += nums[i]*nums[i];
        }
        int val1 = s - sN;
        int val2 = s2 - sN2;
        val2 = val2/val1;

        int x= (val1+ val2)/2;
        int y = x- val1;

        ans[0] = x;
        ans[1] = y;
        
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

//Rearrange Array Elements by Sign -ve and +ve where elements are even. (optimal)

import java.util.Scanner;

public class Arrays25 {
    public static int[] rearrangeArray(int[] nums) {

    int[] ans = new int[nums.length];

    int pos = 0;
    int neg = 1;

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] > 0) {
            ans[pos] = nums[i];
            pos += 2;
        } else {
            ans[neg] = nums[i];
            neg += 2;
        }
    }

    return ans;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        int ans[]= rearrangeArray(nums);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

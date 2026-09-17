// Find the majority element-2  - Optimal

import java.util.*;
public class Arrays37 {
    public static List<Integer> majorityElementTwo(int[] nums) {
        List <Integer> mpp = new ArrayList<>();
        int elem1 = Integer.MIN_VALUE;
        int elem2 = Integer.MIN_VALUE;

        int count1 =0;
        int count2 =0;

        for(int i=0;i<nums.length;i++){
            if(count1 == 0 && nums[i] != elem2){
                count1 =1;
                elem1 = nums[i];
            }
            else if ( count2 == 0 && nums[i]!= elem1){
                count2 =1;
                elem2 = nums[i];
            }

            else if(elem1 == nums[i]){
                count1++;
            }

            else if(elem2 == nums[i]){
                count2++;
            }

            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2 =0;
        for(int i=0;i<nums.length;i++){
            if(elem1 == nums[i]){
                count1++;
            }
            if(elem2 == nums[i]){
                count2++;
            }
        }
        int ans = nums.length /3;
        if(count1 > ans){
            mpp.add(elem1);
        }
        if(count2 > ans){
            mpp.add(elem2);
        }

        return mpp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        
        
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        List<Integer> mpp = majorityElementTwo(nums);

        for(int ans: mpp){
            System.out.println(ans);
        }
    }
}

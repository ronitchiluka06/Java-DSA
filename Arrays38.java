// 3 SUM - Brute force

import java.util.*;

public class Arrays38 {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        for(int i= 0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> ans = new ArrayList<>();
                            ans.add(nums[i]);
                            ans.add(nums[j]);
                            ans.add(nums[k]);
                        Collections.sort(ans);
                        set.add(ans);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(threeSum(nums));

    }
}

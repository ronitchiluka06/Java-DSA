// 4 SUM - Optimal solution
import java.util.*;

public class Arrays43 {
    public  static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                    continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>1 && nums[j]== nums[j-1]){
                    continue;
                }

                int k = j+1;
                int l= n-1;

                while(k<l){
                    if(nums[i]+ nums[j]+ nums[k]+ nums[l] < target){
                        k++;
                    }

                    else if(nums[i]+ nums[j]+ nums[k]+ nums[l] > target){
                        l--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        set.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]== nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]== nums[l+1]){
                            l--;
                        }
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
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(fourSum(nums, target));

    }
}

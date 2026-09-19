// 4 Sum - Better Approach
import java.util.*;

public class Arrays42 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Integer> hashset = new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    int l = target -(nums[i]+ nums[j]+ nums[k]);
                    if(hashset.contains(l)){
                        List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(l);
                            Collections.sort(temp);
                            set.add(temp);
                    }
                    hashset.add(nums[k]);
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

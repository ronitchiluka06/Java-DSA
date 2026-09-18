// 3 SUM - Better approach
import java.util.*;

public class Arrays39 {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        for(int i= 0;i<nums.length;i++){
            HashSet<Integer>set1 = new HashSet<>();
            for(int j=i+1; j<nums.length;j++){
                int k = -(nums[i] + nums[j]);
                if(set1.contains(k)){
                    List<Integer> temp = new ArrayList<>();
                     
                        temp.add(nums[i]);
                        temp.add(nums[j]); 
                        temp.add(k);
                    
                    Collections.sort(temp);
                    set.add(temp);
                }
                set1.add(nums[j]);
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

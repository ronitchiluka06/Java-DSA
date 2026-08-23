// Two Sum - Optimal for case two
import java.util.HashMap;
import java.util.Scanner;

public class Arrays18 {
    public static int[] twoSum(int nums[], int target){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];

            if(mpp.containsKey(needed)){
                return new int[] {mpp.get(needed),i};
            }
            mpp.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        int res[] =twoSum(nums, k);
        System.out.print(res[0]+" "+res[1]);
    }
}

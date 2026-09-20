// Find sub-array with sum K - better solution
import java.util.*;

public class Arrays44 {
    public static int subarraysWithXorK(int[] nums, int k) {
        int count =0;
        for(int i=0;i<nums.length;i++){
        int sum =0; 
            for(int j=i;j<nums.length;j++){
                sum= sum ^ nums[j];
                if( (sum ^ k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int nums[] = new int [n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(subarraysWithXorK(nums, k));
    }
}

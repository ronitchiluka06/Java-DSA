import java.util.*;

public class Arrays13 {
    public static int maxConsecutive(int nums[]){
        int count =0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
                if(count > max){
                    max =count;
                }
                
            }
            else{
                count =0;
            }
        }
        return max;

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(maxConsecutive(nums));
    }
}

// next permutation
import java.util.Scanner;

public class Arrays26 {
    public static void nextPermutation(int[] nums) {
        int pivot =-1;
        int n= nums.length;
        for(int i=n-2;i>= 0 ;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right]= temp;
                left++;
                right--;
                
            }
            return;
        }

        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp = nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        
        int left = pivot+1;
        int right = n-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        nextPermutation(nums);

        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }

        
    }
}

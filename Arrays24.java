// Best Time to Buy and Sell Stock
import java.util.Scanner;

public class Arrays24 {
    public static int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minPrice){
                minPrice= nums[i];
            }
            else{
                int profit =nums[i]-minPrice;
                if(profit>maxPrice){
                    maxPrice=profit;
                    
                }
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nums[]= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        System.out.println(".()"+maxProfit(nums));
    }
}

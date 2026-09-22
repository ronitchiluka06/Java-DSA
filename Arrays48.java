// Merge two sorted Arrays - Brute Force  TC - O(n+m) + O(m) SC- O(m)
import java.util.Arrays;

public class Arrays48 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]= new int[m+n];
        int left =0;
        int right =0;
        int index=0;
        while(left< m && right< n){
            if(nums1[left]<= nums2[right] ){
                ans[index] = nums1[left];
                left++;
                index++;
            }
            else if(nums2[right]<= nums1[left]){
                ans[index]= nums2[right];
                right++;
                index++;
            }
        }

        while(left<m){
            ans[index]= nums1[left];
            left++;
            index++;
        }

        while(right<n){
            ans[index]= nums2[right];
            right++;
            index++;
        }

        for(int i=0;i<ans.length;i++){
            nums1[i]= ans[i];
        }

        
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        Arrays48 obj = new Arrays48();

        obj.merge(nums1, m, nums2, n);

        // Print merged array
        System.out.println(Arrays.toString(nums1));
    }
}

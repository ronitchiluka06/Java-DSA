// Merge Two Sorted Array - Optimal
import java.util.Arrays;

public class Arrays49 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int index = (m+n)-1;

        while(left>= 0 && right>=0){
            if(nums1[left]>nums2[right]){
                nums1[index]=nums1[left];
                left--;
                index--;
            }
            else{
                nums1[index]= nums2[right];
                right--;
                index--;
            }
        }

        while(right>= 0){
            nums1[index]= nums2[right];
            right--;
            index--;
        }
        
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        Arrays49 obj = new Arrays49();

        obj.merge(nums1, m, nums2, n);

        // Print merged array
        System.out.println(Arrays.toString(nums1));
    }
}

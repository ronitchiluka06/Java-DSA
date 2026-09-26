// Find the reverse pairs in array and return its count - Optimal Sol TC - 2  n log (n)  SC- O(n) 

import java.util.*;
public class Arrays53 {
    static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        int temp[] = new int [(high -low) +1 ];
        int index = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index]= arr[right];
                right++;
                
            }
            index++;
        }

        while(left<=mid){
            temp[index] = arr[left];
            left++;
            index++;
        }

        while(right<=high){
            temp[index] = arr[right];
            right++;
            index++;
        }


        for(int i= low ; i<=high ;i++){
            arr[i]= temp[i-low];
        }
    }

    static int countReverse (int arr[] , int low, int mid , int high){
        int count =0;
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right<= high && arr[i] > 2*arr[right]){
                right++;
            }
            count += (right - (mid+1));
        }
        return count;
    }

    static int mergeSort(int arr[], int low, int high){
        int cnt =0;
        if(low >= high){
            return 0;
        }
        int mid = (low + high)/2;

        cnt+= mergeSort(arr, low, mid);
        cnt+= mergeSort(arr, mid+1, high);
        cnt+= countReverse(arr, low, mid, high);
        merge(arr , low , mid, high);

        return cnt;
    }

    public static int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0 , n-1);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(reversePairs(nums));
    }
}

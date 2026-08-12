// rotate array by k places - Optimal 

import java.util.*;

public class Arrays6 {

    public static void rev1(int arr[], int start, int end){
        while(start< end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        k = k % n;

        rev1(arr, 0, k-1);
        rev1(arr, k, n-1);
        rev1(arr, 0, n-1);
        

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

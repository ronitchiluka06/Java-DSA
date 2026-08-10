// left rotate array by 1

import java.util.*;

public class Arrays2 {
    public static void leftRotate(int arr[], int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]= arr[i];
        }
        arr[n-1]= temp;

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        leftRotate(arr, n);
    }
}

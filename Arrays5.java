// rotate array by k places - this is not the optimal

import java.util.*;

public class Arrays5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int temp[] = new int[n];

        for(int i=0;i<k;i++){
            temp[i]= arr[i];
        }

        for(int i=k;i<n;i++){
            arr[i-k]= arr[i];
        }

        for(int i=n-k;i<n;i++){
            arr[i]= temp[(i-(n-k))];
        }


        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

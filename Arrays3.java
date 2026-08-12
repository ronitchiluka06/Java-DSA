// Find second smallest and second largest

import java.util.*;

public class Arrays3 {
    public static void secLargest(int arr[], int n){
        int largest=arr[0];
        int seclargest = -1;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
            else if(arr[i]< largest && seclargest < arr[i]){
                seclargest = arr[i];
            }
        }
        System.out.println("SecLargest" + seclargest);
    }

    public static void secSmallest(int arr[], int n){
        int smallest = arr[0];
        int secsmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]< smallest){
                secsmallest = smallest;
                smallest= arr[i];

            }
            else if(arr[i]> smallest && arr[i]< secsmallest){
                secsmallest = arr[i];
            }   
        }
        System.out.println(secsmallest);
    }
    public static void main (String args[]){
        Scanner  sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        secLargest(arr, n);
        secSmallest(arr, n);
    }
}

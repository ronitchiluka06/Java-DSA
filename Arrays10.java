// Intersection of array

import java.util.*;

public class Arrays10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[m];

        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        int i=0;
        int j=0;

        while(i<n && j<m){
            if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
            else{
                arr.add(a[i]);
                i++;
                j++;
            }
        }

        System.out.println(arr);
    }
}

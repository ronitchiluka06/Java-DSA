// union of two arrays

import java.util.*;

public class Arrays9 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int a[]= new int[n];
        int b[]= new int[m];

        ArrayList<Integer>arrL = new ArrayList<>();

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }

        int i=0;
        int j=0;

        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(arrL.size()==0 || arrL.getLast()!= a[i]){
                    arrL.add(a[i]);
                }
                i++;
            }
            else{
                if(arrL.size()==0 || arrL.getLast()!= b[j]){
                    arrL.add(b[j]);
                }
                j++;
            }

        }

        while(i<n){
            if(arrL.size()==0 || arrL.getLast()!= a[i]){
                arrL.add(a[i]);
            }
            i++;
        }

        while(j<m){
            if(arrL.size()==0 || arrL.getLast()!= b[j]){
                    arrL.add(b[j]);
            }
            j++;
        }

        System.out.println(arrL);
    }
}

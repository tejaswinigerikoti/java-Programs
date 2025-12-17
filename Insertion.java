import java.util.*;

public class Insertion {

    static void insertionSort(int arr[],int n){   
         for(int i=0;i<n;i++){
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int t= arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=t;
            j--;
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
import java.util.*;
public class Quicksort{
    public static int partition(int arr[],int low,int high){
      int p=arr[low];
      int i=low+1;
      int j=high;
      while(i<=j){
        while(arr[i]<=p && i<=j ){
            i++;
        }
        while(arr[j]>p &&i<=j){
            j--;
        }
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;       
         }
         if(i>j){
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
         }
      }
      return j;
    }
public static void  quicksort(int arr[],int low,int high){
    if(low<high){
        int pivot=partition(arr,low,high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);
    }

}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the sizeof array:");
    int n= sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    quicksort(arr,0,n-1);
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
    }
}
}
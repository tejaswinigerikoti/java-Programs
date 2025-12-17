import java.util.*;
public class Merge{
    public static void Mergef(int[] arr,int low,int mid,int high){
        int s1=mid-low+1;
        int s2=high -mid;
        int[] left=new int[s1];
        int[] right=new int[s2];
        for(int i=0;i<s1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<s2;j++){
            right[j]=arr[mid+1+j];
        }
        int l=0,r=0,k=low;
        while(l<s1 &&r<s2){
            if(left[l]<=right[r]){
                arr[k]=left[l];
                l++;
            }
            else{
                arr[k]=right[r];
                r++;
            }
            k++;
        }
        while(l<s1){
            arr[k]=left[l];
            l++;
            k++;
        }
        while(r<s2){
            arr[k]=right[r];
            r++;
            k++;
        }
    }
    public static void Mergesort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid =(low+high)/2;
       Mergesort(arr,low,mid);
      Mergesort(arr,mid+1,high);
     Mergef(arr,low,mid,high);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n= sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Mergesort(arr,0,n-1);
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
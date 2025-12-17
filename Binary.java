import java.util.*;
public record Binary() {
    public static int binarysearch(int n,int[] arr,int B){
        int low=0,high=n-1;
        while(low <=high){
            int mid=(low+high)/2;
            if(arr[mid]==B){
                return mid;
            }
            else if(B<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element is to be searched");
        int B=sc.nextInt();
        System.out.println("Element found at "+binarysearch(n,arr,B));
    }
}

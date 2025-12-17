import java.util.*;
public class Linear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();  
        }
        System.out.println("Enter element to be searched:");
        int b=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==b){
                index=i;
                break;
            }
        }
        System.out.println("Index position is:"+index);
    }
}

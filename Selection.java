import java.util.*;
public class Selection {
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            
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
        selectionSort(arr, n);
        System.out.println("sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "  ");
        }
    }
}
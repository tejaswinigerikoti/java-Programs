import java.util.*;
import java.util.Scanner;
public class Exception{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numerator:");
    int n=sc.nextInt();
    System.out.println("Enter the denominator");
    int d=sc.nextInt();
    int q=n/d;
    System.out.println("The result is :" + q);
    }
}
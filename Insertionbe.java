import java.util.*;
class Node{
    int data;
    Node next;
  Node(int data){
    this.data=data;
    this.next=null;  
  }
}
class Link{
    Node head;
    public void insertionatbe(int data){
         Node newnode=new Node(data);
          newnode.next=head;
          head=newnode;
    }
        public void display(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
public class Insertionbe{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Link obj=new Link();
        System.out.println("enter the size:");
        int n= sc.nextInt();
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            obj.insertionatbe(m);
        }
         obj.display();
    }
}
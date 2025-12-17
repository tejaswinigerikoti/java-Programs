import java.util.*;
class Node{
    int data;
    Node previous;
    Node next;
    Node(int data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }
}
class Linked{
    Node head;
public void insert(int data){
    Node newnode=new Node(data);
    if(head==null){
        head =newnode;
        return;
    }
    Node current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newnode;
    newnode.previous=current;
}
void delete(){
    if(head==null){
        return;
    }
    if(head.next==null){
        head=null;
        return;
    }
    Node current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.previous.next=null;
}
public void print(){
    Node current =head;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
  }
}
public class DoubleLinkedList{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Linked obj=new Linked();
        System.out.println("enter size:");
        int n = sc.nextInt();
        System.out.println("enter no of elements:");
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            obj.insert(m);
        }
        obj.delete();
        obj.print();
    }
}
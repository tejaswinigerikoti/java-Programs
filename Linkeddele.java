import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
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
}
public void deletionAtbeginning(int c){
    while(head!=null &&c>0){
        head=head.next;
           c--;   
   }
}
public void deletionAtend(int c){
    while(head!=null && c>0){
        if(head.next==null){
            head=null;
        }
else{
    Node current=head;
    while (current.next.next!=null){
        current=current.next;
    } 
    current.next=null;
  }
  c--;
    }
}
public void print(){
    Node current =head;
    while(current!=null){
        System.out.print(current.data+" ");
        current =current.next;
    }
  }
}


public class Linkeddele{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Linked obj=new Linked();
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            obj.insert(m);
        }
        System.out.println("enter no of position to be deleted:");
      int c=sc.nextInt();
       obj.deletionAtend(c);
        obj.print();
    }
}
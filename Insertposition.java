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
public void insertionatp(int position,int data){
    Node newnode=new Node(data);
    if (position<1) {
        System.out.print("position invalid");
        }
        if(position==1){
            newnode.next=head;
            head=newnode;
            return;
        }
        Node current=head;
        for(int i=1;i<position;i++){
            if(current==null){
                System.out.println("position out of range");
                return;
            }
            current=current.next;
        }
        if(current==null){
            System.out.println("position out of range");
              return;
        }
        newnode.next=current.next;
        current.next=newnode;
}
public void print(){
    Node current =head;
    while(current!=null){
        System.out.print(current.data+" ");
        current =current.next;
    }
  }
}


public class Insertposition{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        Linked obj=new Linked();
        System.out.println("enter size:");
        int n = sc.nextInt();
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            obj.insert(m);
        }
        System.out.println("enter position:");
          int position =sc.nextInt();
       System.out.println("enter element to insert:");
         int element=sc.nextInt();
           if(position<1 ||position>n-1){
             System.out.println("position out of range");
           }
        else{
             obj.insertionatp(position,element);
             }
          obj.print();
        }
}
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer>l=new LinkedList<>();
        l.add(10);
        l.add(30);
        l.add(55);
        l.add(null);

        System.out.println("The list:"+l);
        for(Object i:l){
            System.out.println(i);
        }

        System.out.println(l.get(0));
        System.out.println(l.isEmpty());

        System.out.println("-----------------------------");
        LinkedList<Object>ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add("python");
        ll.add(40);

        System.out.println("The LinkedList:"+ll);
        for(Object i:ll){
            System.out.println(i);
        }
    }
}
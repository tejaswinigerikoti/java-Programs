import java.util.*;

import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(50);
        ts.add(30);
        ts.add(20);
        for(Object i:ts){
            System.out.println(i);
        }
    }
}
import java.util.*;
import java.util.TreeMap;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String,Object> tm=new TreeMap<String,Object>();
        tm.put("Name","Teju");
        tm.put("age",20);
        tm.put("email","Teju2006@gmail.com");
        System.out.println(tm);
        for(Object obj:tm.keySet()){
            System.out.println(obj);
        }
        System.out.println("----------------------");
        for(Object obj:tm.entrySet()){
            System.out.println(obj);
        }
    }
}
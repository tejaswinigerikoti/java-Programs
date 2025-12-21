import java.util.*;
import java.util.HashSet;
class Dog{
    private String name;
    private String breed;
    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getname(){
        return name;
    }
    public String getbreed(){
        return breed=breed;
    }
    public String toString(){
   return "name of dog = "+name +" name of breed = "+breed;
    }
}
public class HashSetExample {
    public static void main(String[] args) {
        Dog d=new Dog("julie","German Shepherd");
        HashSet<Dog> hs=new HashSet<>();
        System.out.println(hs);
        hs.add(d);
        for (Object obj:hs){
            System.out.println(obj);
        }

    }
}
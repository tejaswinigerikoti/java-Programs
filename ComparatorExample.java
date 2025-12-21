/*Comparator:
  *predefined interface in java.util
  *jdk 1.2
  *comparator has an abstract method called compare()

  *syntax:public int compare(object1,object2)

  *Rules:
    1.Design a new class in such a way which implements the comparator interface and 
      specify the generic type.
    2.import the comparator interface 
    3.override the compare method by specifying the logic for comparing and sorting.
    4.pass the object of the class which has the sorting logic to the related method.


*/

import java.util.*;
import java.util.Comparator;
class NameComparator implements Comparator<Studentt>{
    public int compare(Studentt o1,Studentt o2){
        return o1.getName().compareTo(o2.getName());

    }
}
class rollNoComparator implements Comparator<Studentt>{
    public int compare(Studentt o1,Studentt o2){
        return o1.getrollNo().compareTo(o2.getrollNo());
    }
}
class Studentt{
    private String name;
    private String rollno;
    public String getName(){
        return name;
    }
    public String getrollNo(){
        return rollno;
    }
    Studentt (String name, String rollno){
        super();
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
        return "student name: "+ name+" student rollno: "+ rollno;

    }
}


public class ComparatorExample {
    public static void main(String[] args){
        Studentt s1=new Studentt("Manasa","AK23");
        Studentt s2=new Studentt("likitha","AK22");
        Studentt s3=new Studentt("akhila","AK42");
         Vector<Studentt> v=new Vector<Studentt>();
         v.add(s1);
         v.add(s2);
         v.add(s3);
         Collections.sort(v,new rollNoComparator());
         for(Object i:v){
            System.out.println(i);
         }
    }
    
}

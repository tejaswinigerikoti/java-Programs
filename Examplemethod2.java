import java.util.*;
class Demo{
    int a,b,c;
    int add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
        return c;
    }
}
public class Examplemethod2 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add();
    }
}
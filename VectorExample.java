import java.util.*;
class Car{
    private String carname;
    private String carcolour;
    private int carno;
    public void setcarname(){
        this.carname=carname;
    }
    public String getcarname(){
        return carname;
    }
    public void setcarcolour(){
        this.carcolour=carcolour;
    }
    public String getcarcolour(){
        return carcolour;
    }
    public void setcarno(){
        this.carno=carno;
    }
    public int getcarno(){
        return carno;
        }
        Car(String carname,String carcolour,int carno){
            this.carname=carname;
            this.carcolour=carcolour;
            this.carno=carno;
        }
        public String toString(){
            return "Carname:"+carname+" carcolour:"+ carcolour+" carno:"+ carno;
        }
}
public class VectorExample {
    public static void main(String[] args) {
        Car c=new Car("toyota","balck",2345);
        Car c1=new Car("etiga","black",7777);
        Vector<Car> v=new Vector<>();
        v.add(c);
        v.add(c1);
        for(Object i:v){
            System.out.println(i);
        }
    }
    
}
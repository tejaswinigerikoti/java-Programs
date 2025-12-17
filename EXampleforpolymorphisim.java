import java.util.*;
class Plane{
    void takeoff(){
        System.out.println("plane is takingoff");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landed");
    }
}
class Cargo extends Plane{
    void takeoff(){
    System.out.println("plane is takingoff");
}
    void fly(){
        System.out.println("cargo is flying at low high");
    }
    void specialCargo(){//specializedmethod
        System.out.println("it is special");
    }
}
class Passanger extends Cargo{
    void takeoff(){
    System.out.println("plane is takingoff");
}
    void land(){
        System.out.println("cargo landed safely");
    }
    void gone(){
        System.out.println("cargo was gone");
    }
}
class Fighter extends Passanger{
    void takeoff(){
        System.out.println("takeoff safely");  
    }
    void clash(){
        System.out.println("flight was crashed");
    }

}
public class EXampleforpolymorphisim{
    public static void main(String[] args) {
        Cargo c=new Cargo();
        Passanger p=new Passanger();
        Fighter f=new Fighter();
        Plane ref;
        ref=c;
        ref.takeoff();
        ref.fly();
        ((Cargo)(ref)).specialCargo();
        ref=p;
        ref.takeoff();
        ref.land();
     ((Passanger)(ref)).gone();
        ref=f;
        ref.takeoff();
        ((Fighter)(ref)).clash();
    }
}
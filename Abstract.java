abstract class Plane{
    abstract void takeoff();
    abstract void fly();
    abstract void land();
    }
    class CargoPlane extends Plane{
        void takeoff(){
            System.out.println("CargoPlane is taking off ");
        }
         void fly(){
            System.out.println("CargoPlane is flying at low height  ");
        }
        void land(){
            System.out.println("CargoPlane is landing ");
        }
    }
    class PassangerPlane extends Plane{
        void takeoff(){
            System.out.println("PassangerPlane is taking off ");
        }
         void fly(){
            System.out.println("PassangerPlane is flying at low height  ");
        }
        void land(){
            System.out.println("PassangerPlane is landing ");
        }
    }
    class FligtherPlane extends Plane{
        void takeoff(){
            System.out.println("FligtherPlane is taking off ");
        }
         void fly(){
            System.out.println("FligtherPlane is flying at low height  ");
        }
        void land(){
            System.out.println("FligtherPlane is landing ");
        }
    }
    class Airport{
        void permit(Plane ref){
            ref.takeoff();
            ref.fly();
            ref.land();
        }
    }
public class Abstract {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassangerPlane pp = new PassangerPlane();
        FligtherPlane fp = new FligtherPlane();
        Airport a = new Airport();
        a.permit(fp);
        a.permit(cp);
        a.permit(pp);
    }
}
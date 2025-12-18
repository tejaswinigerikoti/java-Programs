import java.util.*;
class Demo1{
    void div() throws ArithmeticException {
        int a = 5;
        int b = 0;
        System.out.println(a/b);
    }
}
    public class Demo2{
        public static void main(String[] args) {
            Demo1 d = new Demo1();
            try {
                d.div();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        }
    }
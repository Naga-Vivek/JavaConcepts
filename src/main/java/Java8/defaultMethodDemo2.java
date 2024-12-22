package Java8;

// Multiple Inheritance in interfaces
interface I{
    default void demo(){
        System.out.println("HI");
    }
}
interface J{
    default void demo(){
        System.out.println("HELLO");
    }
}
class A1 implements I,J {
    public void demo(){
        I.super.demo();
        J.super.demo();
        System.out.println("THANKS");
    }
}
public class defaultMethodDemo2 {
    public static void main(String args[]){
        new A1().demo();
    }
}
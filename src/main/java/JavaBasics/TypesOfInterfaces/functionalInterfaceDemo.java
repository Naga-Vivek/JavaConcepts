package JavaBasics.TypesOfInterfaces;

@FunctionalInterface
interface myFunctionalInterface{
    void display(String msg);
    default void show(){
        System.out.println("Default Method");
    }; 
    //void demo();//gives error as it is not a functional interface
}
class myFunctionalInterfaceImpl implements myFunctionalInterface{
    @Override
    public void display(String msg) {
        System.out.println(msg+"$");
    }
}
public class functionalInterfaceDemo {
    public static void main(String args[]){
        // Functional Interface can be implemented in multiple ways.
        // 1. Using Lambda Expression
        myFunctionalInterface m = (msg) -> System.out.println(msg+"**");
        m.display("Using Lambda Expression");
        //2. Using Anonymous Class
        myFunctionalInterface m1 = new myFunctionalInterface() {
            @Override
            public void display(String msg) {
                System.out.println(msg+":)");
            }
        };
        m1.display("Using Anonymous Class");
        //3. Using Class Implementation
        myFunctionalInterface m2 = new myFunctionalInterfaceImpl();
        m2.display("Using Class Implementation");
        //4. Using Method Reference
        myFunctionalInterface m3 = System.out::println;
        m3.display("Using Method Reference");       

        
    }
}
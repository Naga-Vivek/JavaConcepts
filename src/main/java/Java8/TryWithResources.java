package Java8;

public class TryWithResources{
    public static void main(String args[]){
        // try with resources 
        try(A a1 = new A();B b1 = new B();){
            a1.process();
            b1.process();
            if(true){
                throw new NullPointerException();
            }
        }// Resources are released even before going to catch block
        catch(Exception e){// optional catch block
            System.out.println("Exception caught");
        }
        //a1.close(); doesnt allow as scope of a1 is within try block
        System.out.println("Program Continues.......");
    }
}
class A implements AutoCloseable{
    public A(){
        System.out.println("Allocating resources for A");
    }
    public void process(){
        System.out.println("Processing with some business logic of A...");
    }
    public void close(){
        System.out.println("Releasing resources for A");
    }

}
class B implements AutoCloseable{
    public B(){
        System.out.println("Allocating resources for B");
    }
    public void process(){
        System.out.println("Processing with some business logic of B...");
    }
    public void close(){
        System.out.println("Releasing resources for B");
    }

}
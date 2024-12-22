package Java8;

public interface defaultMethodDemo {
    int x=10;
    void sample();
    default void demo(){
        System.out.println("default implementation of demo method");
    }
    public static void main(String args[]){
        defaultMethodDemo d = new A7();
        d.sample();
        d.demo();
    }
}
class A7 implements defaultMethodDemo{

    @Override
    public void sample() {
        System.out.println("A7 implementation of sample method");
    }
    @Override
    public void demo(){
        System.out.println("A7 implementation of demo method");
    }
}

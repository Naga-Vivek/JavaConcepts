package Java8;

// Static methods in interface
interface I1{
    static void demo(){ // static method with a body
        System.out.println("HI");
    }
}
interface staticMethodInInterfaceDemo{
    public static void main(String args[]){ // main method is also a static method , so main also works in a interface
        I1.demo();
    }
}
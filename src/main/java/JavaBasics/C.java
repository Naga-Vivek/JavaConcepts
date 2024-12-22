package JavaBasics;

// Multiple inheritance
class A9{
    void demo(){
        System.out.println("hii");
    }
}
class B9{
    void demo(){
        System.out.println("hello");
    }
}
interface A10{
    void demo1();
}
interface B10{
    void demo1();
}
//class C extends A9, B9{   // Gives Syntax error , Multiple inheritance of two super classes not allowed
class C implements A10,B10{ // Allowed , Multiple inheritance of two super interfaces but both must be abstract
    @Override
    public void demo1(){
        System.out.println("thanks");
    }
    public static void main(String args[]){
        C c = new C();
        c.demo1();
    }
}
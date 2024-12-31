package DesignPatterns;

/*
class B extends clas A
* Only one object of A to be instantiated
* Only one object of B to be instantiated
* Should get an exception if trying to create more than 1 object of any of these A/B class


A a1 = A.getObject();
B b1 = B.getObject();
A a2 = A.getObject();	// Exception should occur

HINT : use - this instance of
 */

class A{
    private static A a1 = null;
    private static boolean aInstance = false;
    private static boolean currentClassObjectCreated = false;
    protected A(){
        if(this instanceof B){
        }
        else if(currentClassObjectCreated)
            throw new InstanceAlreadyExistException("A object already exist....");
        currentClassObjectCreated = true;
    }
    public static A getObject(){
        if(aInstance){
            throw new InstanceAlreadyExistException("A object already exist.....");
        }
        if(a1==null){
            a1 = new A();
            aInstance = true;
        }
        return a1;
    }
}
class B extends  A{
    private static B b1 = null;
    private static boolean bInstance = false;
    private B(){
        super();
    }
    public static B getObject(){
        if(bInstance){
            throw new InstanceAlreadyExistException("B object already exist........");
        }
        if(b1==null){
            b1 = new B();
            bInstance = true;
        }
        return b1;
    }
}
class InstanceAlreadyExistException extends RuntimeException{
        InstanceAlreadyExistException(){
        }
        InstanceAlreadyExistException(String msg){
            super(msg);
        }
}
public class SingletonAssignment {
    public static void main(String[] args) {
        A a1 = A.getObject();
        System.out.println(a1);
        B b1 = B.getObject();
        System.out.println(b1);
        //A a2 = A.getObject();	// Exception
        //B b2 = B.getObject(); // Exception
    }
}


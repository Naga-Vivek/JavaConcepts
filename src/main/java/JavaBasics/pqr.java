package JavaBasics;

public class pqr{
    public static void main(String args[]){
        System.out.println("From the only public pqr class from pqr.java");
    }
}
class X{
    public static void main(String args[]){
        System.out.println("Hello Everybody from X");
        Y.main(args); //To explicity call a main method within program
        Z.main(args);
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        X.main(args); //recursively calling X's main method which runs indefinitely
    }
}
class Y{
    public static void main(String args[]){
        System.out.println("Hello Everybody from Y");
    }
}
class Z{
    public static void main(String args[]){
        System.out.println("Hello Everybody from Z");
    }
}

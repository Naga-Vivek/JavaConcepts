package JavaBasics.TypesOfClasses;

// Types of Anonymous Inner Class
public class AnonymousInnerClassDemo2 {
    public static void main(String args[]){
        // Anonymous Inner Class that extends a Class
        Thread t = new Thread(){
            public void run(){
                System.out.println("In Anonymous Inner Class that extends Thread class");
            }
        };
        t.start();

         // Anonymous Inner Class that implements an interface.
         Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("In Anonymous Inner Class that implements Runnable interface");
            }
         };
         Thread t1 = new Thread(runnable);
         t1.start();

         //Anonymous Inner class that defines inside method/constructor argument
         Thread t2 = new Thread(new Runnable() {
            public void run(){
                System.out.println("In Anonymous Inner Class that is defined inside Thread constructor argument");
            }
         });
         t2.start();
    }
}

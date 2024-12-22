package JavaBasics.TypesOfClasses;

interface Greeting {
    void sayHello();
}
class Feedback{
    void giveFeeback(){
        System.out.println("good");
    }
}

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous inner class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };


        greeting.sayHello(); // Calling the method
        Feedback feedback  = new Feedback();
        feedback.giveFeeback();
        Feedback feedback1 = new Feedback(){
            @Override
            public void giveFeeback(){
                System.out.println("bad");
            }
        };
        feedback1.giveFeeback();

    }
}

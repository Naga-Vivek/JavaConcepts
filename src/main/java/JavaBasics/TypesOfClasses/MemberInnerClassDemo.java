package JavaBasics.TypesOfClasses;

class OuterClass1 {
    private String message = "Hello from Outer Class!";

    // Member Inner Class
    class InnerClass {
        void display() {
            System.out.println(message); // Accessing private member of outer class
        }
    }
}

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass(); // Creating Inner Class object
        inner.display(); // Calling inner class method
    }
}

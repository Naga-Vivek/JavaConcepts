package JavaBasics.TypesOfClasses;

class OuterClass2 {
    void printMessage() {
        String message = "Hello from Local Inner Class!";

        // Local Inner Class inside a method
        class LocalInner {
            void display() {
                System.out.println(message); // Accessing local variable of the method
            }
        }

        LocalInner localInner = new LocalInner(); // Creating Local Inner Class object
        localInner.display();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        outer.printMessage();
    }
}

